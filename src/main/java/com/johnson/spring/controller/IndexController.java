package com.johnson.spring.controller;

import com.johnson.spring.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/index-api")
public class IndexController {

    @Value("${index.title}")
    private String indexTitle;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title", indexTitle);
        return "index"; //nombre de la vista html del directorio /templates
    }

    @GetMapping("/user")
    public String getUsuario(Model model){
        model.addAttribute("userProfile",
                new User("johnson", "acaro", "johnson@test.com"));
        return "profile";

    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        List<User> users = Arrays.asList(new User("johnson", "acaro", "johnson@test.com"),
                new User("noelia", "ubierna", "noe@gmail.com"),
                new User("john", "doe", "dissapeared@test.com"));
        model.addAttribute("users", users);
        return "profileList";

    }
}
