package com.kodilla.kodilla.patterns2;

import com.kodilla.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.kodilla.patterns2.decorator.pizza.DoubleCheeseDecorator;
import com.kodilla.kodilla.patterns2.decorator.pizza.ExtraHotPizzaDecorator;
import com.kodilla.kodilla.patterns2.decorator.pizza.PizzaOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
public class PizzaOrderServiceTestSuite {

    @Test
    public void testPizzaOrderXtraHotDoubleCheeseCost(){
        //Given
        PizzaOrder pizzaOrder=new BasicPizzaOrder();
        pizzaOrder=new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder=new ExtraHotPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost=pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30),cost);
    }  @Test
    public void testPizzaOrderXtraHotDoubleCheeseDesc(){
        //Given
        PizzaOrder pizzaOrder=new BasicPizzaOrder();
        pizzaOrder=new DoubleCheeseDecorator(pizzaOrder);
        pizzaOrder=new ExtraHotPizzaDecorator(pizzaOrder);
        //When
      String ingredients= pizzaOrder.getIngredients();
        //Then
        assertEquals("pizza dogh, tomato sauce,cheese,extra cheese, chili, tabasco",ingredients);
    }
}
