package com.johnson.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title", "hola soy Johnson Acaro Arrobo");
        return "index"; //nombre de la vista html del directorio /templates
    }
}
