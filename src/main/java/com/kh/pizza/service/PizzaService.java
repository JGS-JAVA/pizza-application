package com.kh.pizza.service;

import com.kh.pizza.dto.Pizza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {
    List<Pizza> getAllPizzas();
    Pizza getPizzaById(int id);
    int editPizza(Pizza pizza);
    void insertPizza(Pizza pizza);
}
