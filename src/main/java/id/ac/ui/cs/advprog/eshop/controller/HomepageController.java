package id.ac.ui.cs.advprog.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/")
public class HomepageController {
    @GetMapping("/")
    public String homePage() {
        return "HomePage";
    }
}