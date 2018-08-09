package ua.com.store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.com.store.entity.User;
import ua.com.store.service.UserService;
import ua.com.store.validator.UserValidator;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.security.Principal;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;


    @GetMapping("/")
    public String home(Model model){
        return "/mainView/index";
    }



    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("eUser")  @Valid User user ,BindingResult result,
                           @RequestParam("userImageX")MultipartFile multipartFile){
        if (result.hasErrors()){
            System.out.println("We have error!!!");
            return "/mainView/indexNext";
        }
        String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        user.setUserImage("\\images\\" + multipartFile.getOriginalFilename());
        userService.save(user);

        return "/mainView/indexNext";
    }

    @GetMapping("/indexNext")
    public String next(Model model){
        model.addAttribute("eUser", new User());
        return "/mainView/indexNext";
    }



    @GetMapping("/adm")
    public String admin(Principal principal, Model model){
        model.addAttribute("user",principal);
        return "/adminView/admin";
    }


    @GetMapping("login")
    public String login(){
        return "/mainView/login";
    }

    @GetMapping("users")
    public String users(Model model){
//        List<User> users = userService.findAllWithProducts();
//        List<UserProductDTO> dtos = new ArrayList<>();
//        for (User user : users) {
//            UserProductDTO dto = new UserProductDTO();
//            dto.setIdUser(user.getId());
//            dto.setUsername(user.getUsername());
//            dto.setUserPassoword(user.getPassword());
//            dto.setUserPhoto(user.getUserImage());
//            dto.setIdProduct(user.getProducts());
//        }
//

        model.addAttribute("users",userService.findAll());
//        model.addAttribute("products",productService.findAll());
        return "/userView/users";
    }

    @GetMapping("/user-{id}")
    public String user(@PathVariable("id") int id,Model model){
        User one = userService.findOne(id);
        model.addAttribute("user",one);
        return "userView/user";
    }

    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(userValidator);
    }



}
