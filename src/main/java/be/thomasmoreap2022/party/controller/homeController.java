package be.thomasmoreap2022.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class homeController {

    private final  int number = 35;
    @GetMapping(value = {"/", "/home", "/hom/"})
    public String home(Model model){
        model.addAttribute("number", number);
        return "home";
    }
    @GetMapping("/about")
    public String About(){
        return "about";
    }
    @GetMapping("/venuelist")
    public String venuelist(){
        return "venuelist";
    }
    @GetMapping("/venuedetails/{venuename}")
    public String venuedetails(Model model, @PathVariable String venuename){
        model.addAttribute("venuname",venuename);
        return "venuedetails";
    }
}
