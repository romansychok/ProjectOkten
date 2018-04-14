package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.store.entity.Product;
import ua.com.store.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String products(Model model){
        model.addAttribute("product",new Product());
        return "product";
    }

    @PostMapping("/saveProduct")
    public String listOfProduct(@ModelAttribute Product product,Model model){
        productService.save(product);
        return "redirect:/";

    }

}
