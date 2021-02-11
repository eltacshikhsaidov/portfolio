package me.eltacshikhsaidov.portfolio.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {
    
    
    public static syncronized int count() {
        int count = 0;
        count ++;
        return count;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("count", count());
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/works")
    public String works() {
        return "works";
    }
}
