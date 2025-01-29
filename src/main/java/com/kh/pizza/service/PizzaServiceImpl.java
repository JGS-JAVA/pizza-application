package com.kh.pizza.service;

import com.kh.pizza.dto.Pizza;
import com.kh.pizza.mapper.PizzaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{
    
    @Autowired
    PizzaMapper pizzaMapper;
    
    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaMapper.getAllPizzas();
    }

    @Override
    public Pizza getPizzaById(int id) {
        return pizzaMapper.getPizzaById(id);
    }

    @Override
    public int editPizza(Pizza pizza) {
        return pizzaMapper.editPizza(pizza);
    }

    @Override
    public void insertPizza(Pizza pizza) { // void 는 리턴값 없다
       
    }
}
