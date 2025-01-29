package com.kh.pizza.controller;
import com.kh.pizza.dto.Pizza;
import com.kh.pizza.service.PizzaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PizzaApiController {

    @Autowired
    private PizzaServiceImpl pizzaService;

    @GetMapping("/api/pizzas")
    public List<Pizza> getPizzas() {
        return pizzaService.getAllPizzas();
    }

    @GetMapping("/api/pizza/{id}")
    public Pizza getPizza(@PathVariable("id") int id) {
        return pizzaService.getPizzaById(id); }

    @PutMapping("/api/pizza/edit/{id}")
    public int getPizzaEdit(@PathVariable("id") int id,
                            @RequestBody Pizza pizza) {
        pizza.setId(id);
        return pizzaService.editPizza(pizza);
    }

    @PostMapping("/api/pizza/insert")
    public  insertPizza(@RequestBody Pizza pizza) {
        return pizzaService.insertPizza(pizza);
    }
}

