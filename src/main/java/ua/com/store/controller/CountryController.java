package ua.com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.store.entity.Country;
import ua.com.store.service.CountryService;
import ua.com.store.validator.CountryValidator;

import javax.validation.Valid;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryValidator countryValidator;


//
//    @PostMapping("/saveCountry")
//    public String save(@RequestParam("countryName") String countryName){
//        Country country = new Country();
//        country.setCountryName(countryName);
//        countryService.save(country);
//        return "country";
//
//   }

    @GetMapping("/country")
    public String next(Model model){
        model.addAttribute("eCountry",new Country());
        return "country";
    }

    @PostMapping("/saveCountry")
    public String saveCountry(@ModelAttribute("eCountry") @Valid Country country,BindingResult result){
        if (result.hasErrors()){
            System.out.println("country error");
            return "country";
        }
        countryService.save(country);
        return "country";
    }


    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(countryValidator);
    }





}
