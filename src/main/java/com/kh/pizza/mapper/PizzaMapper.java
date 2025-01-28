package com.kh.pizza.mapper;

import com.kh.pizza.dto.Pizza;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PizzaMapper {
    List<Pizza> getAllPizzas();
    Pizza getPizzaById(int id);
    int editPizza(Pizza pizza);
    void insertPizza(Pizza pizza);
}
