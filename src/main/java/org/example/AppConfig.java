package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Abhay", 20);
    }

    @Bean
    public CartService createCart(){
        return new CartService();
    }
}
