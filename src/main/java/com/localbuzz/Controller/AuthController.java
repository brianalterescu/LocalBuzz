package com.localbuzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller // Changed from @RestController to @Controller to return views
public class AuthController {

    
    @GetMapping("/") 
    public String home() {
        return "index"; // This should correspond to index.html in the templates folder
    }
    @GetMapping("/Register")
    public String registerPage() {
        return "Register"; // This will load register.html from the templates folder
    }
    @PostMapping("/main")
    public ModelAndView homePage() {
         ModelAndView mav = new ModelAndView("main"); // This will load result.html
        return mav; // This will load home.html from the templates folder
    }
    
     
}
