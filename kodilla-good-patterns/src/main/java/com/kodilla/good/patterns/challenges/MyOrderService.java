package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class MyOrderService implements OrderService {
    private User user;
    private Product product;

    public MyOrderService(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    @Override
    public boolean order(User user, Product product, LocalDate orderDate) {
        if(user.equals(null)||product.equals(null)||orderDate.equals(null)){
            System.out.println("no user");
            return false;}
        return true;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public LocalDate getOrderDate() {
        return LocalDate.now();
    }
}
