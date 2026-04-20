package com.example.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // works to return the page
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody  - used if i  want to display body only
    public  String greet(){
        return "welcome abhi";
    }

    @RequestMapping("/about")
    public String about(){
        return "dont teach me";
    }
}
