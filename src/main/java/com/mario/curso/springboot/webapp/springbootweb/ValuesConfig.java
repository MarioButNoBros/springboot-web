package com.mario.curso.springboot.webapp.springbootweb;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:values.properties")
public class ValuesConfig {
}
