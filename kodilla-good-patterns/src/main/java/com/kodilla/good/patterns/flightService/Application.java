package com.kodilla.good.patterns.flightService;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        FlightFinder find = new FlightFinder();
        FlightDisplayService display = new FlightDisplayService();
        System.out.println("Enter departure Airport");
        Scanner airport=new Scanner(System.in);
        String fromAirport=airport.next();
        System.out.println("Enter arrival Airport");
        String toAirport=airport.next();
        display.displayFlights(find.findDirectConnection(fromAirport, toAirport));
        display.displayFlights(find.findConnectedFlights(fromAirport, toAirport));


    }
}
