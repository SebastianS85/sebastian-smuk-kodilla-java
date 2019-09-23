package com.kodilla.hibernate.manytomany.facade;

public class SearchExeption extends Exception {

    public static String ERR_SEARCH_ERROR="Search Erroe";

    public SearchExeption(String message) {
        super(message);
    }
}
