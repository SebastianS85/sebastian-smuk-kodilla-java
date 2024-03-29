package com.kodilla.kodilla.patterns2.decorator.pizza;

import com.kodilla.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public abstract  class AbstractPizzaOrderDecorator implements PizzaOrder{

   private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients();
    }
}
