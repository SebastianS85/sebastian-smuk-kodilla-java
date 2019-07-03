package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public MyOrderService orderRequest () {
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Buty", 200);
        return new MyOrderService(user,product);
    }

}
