package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    public boolean order(User user, Product product, LocalDate orderDate);
    public User getUser();
    public Product getProduct();
    public LocalDate getOrderDate();
}
