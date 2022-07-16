package com.johnson.spring.controller;

import com.johnson.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index-api")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "hola soy Johnson Acaro Arrobo");
        return "index"; //nombre de la vista html del directorio /templates
    }

    @GetMapping("/user")
    public String getUsuario(Model model){
        model.addAttribute("userProfile",
                new User("johnson", "acaro", "johnson@test.com"));
        return "profile";

    }
}
