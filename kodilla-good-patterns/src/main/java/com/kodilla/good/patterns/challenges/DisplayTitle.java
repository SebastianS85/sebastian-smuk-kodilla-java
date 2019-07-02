package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class DisplayTitle {

    public static void main(String[] args) {
        MovieStore movieStore=new MovieStore();
        String theResultList=movieStore.getMovies()
                .values()
                    .stream()
                        .map(s->String.valueOf(s))
                            .collect(Collectors.joining("!","",""));
        System.out.println(theResultList);
    }
}
