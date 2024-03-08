package com.mario.curso.springboot.webapp.springbootweb.controllers;

import com.mario.curso.springboot.webapp.springbootweb.models.User;
import com.mario.curso.springboot.webapp.springbootweb.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValue}")
    private String[] listOfValue;
    @Value("${config.code}")
    private Integer code;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message){

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id){

        Map<String, Object> json = new HashMap<>();
        json.put("product",product);
        json.put("id",id);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(){

        Map<String, Object> json = new HashMap<>();

        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("listOfValue", listOfValue);

        return json;

    }
}
