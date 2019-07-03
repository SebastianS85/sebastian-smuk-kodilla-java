package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Buty", 200);
        return new OrderRequest(user,product);
    }
}
