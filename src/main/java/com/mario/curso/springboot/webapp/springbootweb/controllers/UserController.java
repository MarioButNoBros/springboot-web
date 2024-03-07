package com.mario.curso.springboot.webapp.springbootweb.controllers;

import com.mario.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Mario","Giraldo");
        user.setEmail("prueba@gmail.com");
        model.addAttribute("tittle","Buenos dias!!! :D");
        model.addAttribute("user",user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title", "Lista de usuarios");
//        model.addAttribute("users", users);

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModels(){
        List<User> users = Arrays.asList(
                new User("Mario", "Giraldo","sitiene@correo.com"),
                new User("Pruebame","Esta"),
                new User("Json", "Object","sitiene@correo.com"));

        return users;
    }
}
