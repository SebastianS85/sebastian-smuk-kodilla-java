package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class DisplayTitle {

    public static void main(String[] args) {
        MovieStore movieStore=new MovieStore();

       String theResultList=movieStore.getMovies()
               .entrySet()
                 .stream()
                    .flatMap(e->e.getValue()
                       .stream())
                            .collect(Collectors.joining("!","",""));


        System.out.println(theResultList);
    }
}
