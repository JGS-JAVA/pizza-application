package com.kh.pizza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaApiController {



    @GetMapping("/pizzas")
    public getAllPizzas() {

    }

    @PostMapping("/pizzas")
    public  insertPizza() {

        return ;
    }
}

