package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.store.entity.Category;
import ua.com.store.service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/category")
    public String categories(Model model){
        model.addAttribute("category", new Category());
        return "category";
    }

    @PostMapping("/saveCategory")
    public String listOfCategory(@ModelAttribute Category category,Model model){
        categoryService.save(category);
        return "redirect:/";
    }


}
