package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.com.store.entity.Brand;
import ua.com.store.service.BrandService;

import java.io.File;
import java.io.IOException;

@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand")
    public String brand(){
        return "brand";
    }


    @PostMapping("/saveBrand")
    public String brand(@RequestParam("brandName") String brandName,@RequestParam("brandImage")
            MultipartFile multipartFile){
        String path = System.getProperty("user.home") + File.separator + "projectImages\\";

        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setBrandImage("\\images\\" + multipartFile.getOriginalFilename());
        brandService.save(brand);
        return "redirect:/";

    }

}
