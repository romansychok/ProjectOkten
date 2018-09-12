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

    @GetMapping("/productAdmin")
    public String next(Model model){
        model.addAttribute("eProduct",new Product());
        return "/adminView/productAdmin";
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
        return "/mainView/index";
    }


    @GetMapping("/product-{id}")
    public String productPage(@PathVariable("id") int id, Model model){
        Product product = productService.findOne(id);
        model.addAttribute("product",product);
        return "/productView/productPage";
    }

    @GetMapping("/productsAdmin")
    public String products(Model model){
        model.addAttribute("productsAdmin", productService.findAll());
        return "/adminView/productsAdmin";
    }

    @GetMapping("/deleteProduct/{id}")
    public String delete(@PathVariable int id){
        productService.delete(id);
        return "/productView/products";
    }


    @GetMapping("/productUpdate")
    public String productUpdate(Model model){
        model.addAttribute("eProductUpdate", new Product());
        return "/adminView/productUpdate";
    }

    @PostMapping("/updateProduct}") //Not working well!!!
    public String update(@ModelAttribute("eProductUpdate") Product product, BindingResult result,
                         @RequestParam("pathImage") MultipartFile multipartFile){
        String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        product.setPathImage("\\images\\" + multipartFile.getOriginalFilename());
        productService.update(product);

        return "/mainView/index";


    }


    @InitBinder
    public void init(WebDataBinder binder){
        binder.registerCustomEditor(Category.class, new CategoryEditor());
    }




}
