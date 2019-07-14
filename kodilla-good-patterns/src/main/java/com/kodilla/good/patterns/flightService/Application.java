package com.kodilla.good.patterns.flightService;


public class Application {
    public static void main(String[] args) {

        FlightFinder find = new FlightFinder();
        FlightDisplayService display = new FlightDisplayService();
        display.displayFlights(find.findDirectConnection("Gdansk", "Katowice"));
        display.displayFlights(find.findConnectedFlights("Gdansk", "Berlin"));


    }
}
