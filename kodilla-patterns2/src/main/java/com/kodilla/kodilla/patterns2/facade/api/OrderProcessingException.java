package com.kodilla.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED="User not authorised";
    public static String ERR_PAYMENT_REJECTED="Payment was rejected";
    public static String ERR_VERIFICATION_ERROR="Verification ERROR";
    public static String ERR_SUBMITTING_ERROR="Submitting error";

    public OrderProcessingException(String message){
        super(message);
    }


}
