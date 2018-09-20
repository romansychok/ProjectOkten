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



    @GetMapping("/country")
    public String next(Model model){
        model.addAttribute("eCountry",new Country());
        return "/countryView/country";
    }

    @PostMapping("/saveCountry")
    public String saveCountry(@ModelAttribute("eCountry") @Valid Country country,BindingResult result){
        if (result.hasErrors()){
            System.out.println("country error");
            return "/countryView/country";
        }
        countryService.save(country);
        return "/countryView/country";
    }

//    @GetMapping("/countries")
//    public String getCountries(Model model){
//        model.addAttribute("countries",countryService.findAll());
//        return "/countryView/countries";
//    }
//
    @GetMapping("/countryUpdate/{id}")
    public String getCountry(@PathVariable int id, Model model) {
    model.addAttribute("countryAttribute", countryService.findOne(id));
    return "/adminView/countryUpdate";
}

    @PostMapping("/countryUpdate/{id}")
    public String updateCountry(@ModelAttribute Country country, @PathVariable int id, Model model) {
        country.setId(id);
        model.addAttribute("countryAttribute", countryService.findOne(id));
        countryService.update(country);
        return "/countryView/country";
    }



        @GetMapping("/country-{id}")
        public String countryPage(@PathVariable("id") int id, Model model){
                model.addAttribute("country",countryService.findOne(id));
                return "/countryView/countryPage";
        }

        @GetMapping("/countries")
        public String countries(Model model){
            model.addAttribute("countries",countryService.findAll());
            return "/countryView/countries";
        }






    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(countryValidator);
    }





}
