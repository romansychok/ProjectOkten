package ua.com.store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.com.store.entity.Product;
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
        return "index";
    }



    @PostMapping("/save")
    public String save(@RequestParam("username") String username, @RequestParam("password") String password,
                       @RequestParam("userImage")MultipartFile multipartFile)  {



       String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
       user.setUserImage("\\images\\" + multipartFile.getOriginalFilename());
       userService.save(user);

        return "redirect:/";

    }


    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("eUser")@Valid User user,BindingResult result){
        if (result.hasErrors()){
            System.out.println("We have error!!!");
            return "indexNext";
        }
        userService.save(user);
        return "index";
    }

    @GetMapping("/indexNext")
    public String next(Model model){
        model.addAttribute("eUser", new User());
        return "indexNext";
    }



    @GetMapping("/adm")
    public String admin(Principal principal, Model model){
        model.addAttribute("user",principal);
        return "admin";
    }


    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("users")
    public String users(Model model){
        model.addAttribute("users",userService.findAll());
        return "users";
    }

    @GetMapping("/user-{id}")
    public String user(@PathVariable("id") int id,Model model){
        User one = userService.findOne(id);
        model.addAttribute("user",one);
        return "user";
    }

    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(userValidator);
    }



}
