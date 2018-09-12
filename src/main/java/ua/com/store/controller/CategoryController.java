package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.store.entity.Category;
import ua.com.store.service.CategoryService;
import ua.com.store.service.ProductService;
import ua.com.store.validator.CategoryValidator;

import javax.validation.Valid;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryValidator categoryValidator;


    @GetMapping("/categoryAdmin")
    public String next(Model model){
        model.addAttribute("eCategory", new Category());
        return "/adminView/categoryAdmin";
    }

    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("eCategory") @Valid Category category, BindingResult result){
        if (result.hasErrors()){
            System.out.println("Category has errorrrrrrr");
            return "/adminView/categoryAdmin";
        }
        categoryService.save(category);
        return "/mainView/index";
    }

    @GetMapping("/categories")
    public String categories(Model model){
        model.addAttribute("categories", categoryService.findAll());
        return "/categoryView/categories";
    }


    @GetMapping("/category-{id}")
    public String category(@PathVariable("id") int id, Model model){
        Category category = categoryService.findOne(id);
        model.addAttribute("category",category);
        return "/categoryView/categoryPage";
    }







    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(categoryValidator);
    }


}
