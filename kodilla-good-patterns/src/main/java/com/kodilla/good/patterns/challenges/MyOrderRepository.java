package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class MyOrderRepository implements OrderRepository {


    @Override
    public void createOrder(User user, Product product, LocalDate orderDate) {
        System.out.println("User"+user.getUserName()+user.getUserSurname()+" "+"ordered:"+product.productName+" added to repository at:"+LocalDate.now());
    }
}
