package me.eltacshikhsaidov.portfolio.conroller;

import me.eltacshikhsaidov.portfolio.service.CountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final CountService countService;

    public MainController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("count", countService.incerement());
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
