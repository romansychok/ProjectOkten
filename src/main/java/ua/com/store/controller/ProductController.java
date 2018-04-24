package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.com.store.editor.CategoryEditor;
import ua.com.store.entity.Category;
import ua.com.store.entity.Product;
import ua.com.store.service.ProductService;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;



//    @PostMapping("/saveProduct")
//    public String listOfProduct(@ModelAttribute Product product,Model model){
//        productService.save(product);
//        return "redirect:/";
//
//    }

    @GetMapping("/product")
    public String next(Model model){
        model.addAttribute("eProduct",new Product());
        return "product";
    }

    @PostMapping("/saveProduct")
    public String save(@ModelAttribute("eProduct")  Product product, BindingResult result,
                       @RequestParam("pathImage") MultipartFile multipartFile ){
    String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
        multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
    } catch (IOException e) {
        e.printStackTrace();
    }
        product.setPathImage("\\images\\" + multipartFile.getOriginalFilename());
        productService.save(product);
        return "product";
    }

    @InitBinder
    public void init(WebDataBinder binder){
        binder.registerCustomEditor(Category.class, new CategoryEditor());
    }




}
