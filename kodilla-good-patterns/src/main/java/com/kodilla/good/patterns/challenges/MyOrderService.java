package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class MyOrderService implements OrderService {


    @Override
    public boolean order(User user, Product product, LocalDate orderDate) {
        if(user==null||product==null||orderDate==null){
            System.out.println("no user");
            return false;}
        return true;
    }


}
