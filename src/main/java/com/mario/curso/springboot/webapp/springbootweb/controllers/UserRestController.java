package com.mario.curso.springboot.webapp.springbootweb.controllers;

import com.mario.curso.springboot.webapp.springbootweb.models.User;
import com.mario.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("api/")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Mario","Giraldo");
        userDto.setUser(user);
        userDto.setTitle("Hola :D");

        return userDto;
    }

    @GetMapping("/details/list")
    public List<User> list(){
        User user = new User("prueba","prueba1");
        User user2 = new User("prueba","prueba2");
        User user3 = new User("prueba","prueba3");

        List<User> users = Arrays.asList(user,user2,user3);
        /*List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);*/

        return users;
    }
}
