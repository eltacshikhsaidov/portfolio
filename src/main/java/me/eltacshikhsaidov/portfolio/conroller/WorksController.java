package me.eltacshikhsaidov.portfolio.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorksController {

    @GetMapping("/practices-1")
    public String practices1() {
        return "work-1";
    }

    @GetMapping("/practices-2")
    public String practices2() {
        return "work-2";
    }

    @GetMapping("/practices-3")
    public String practices3() {
        return "work-3";
    }

    @GetMapping("/practices-4")
    public String practices4() {
        return "work-4";
    }

    @GetMapping("/practices-5")
    public String practices5() {
        return "work-5";
    }

    @GetMapping("/practices-6")
    public String practices6() {
        return "work-6";
    }
}
