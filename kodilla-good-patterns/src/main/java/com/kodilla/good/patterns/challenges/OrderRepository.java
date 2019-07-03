package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    public void createOrder(User user, Product product, LocalDate orderDate);

}
