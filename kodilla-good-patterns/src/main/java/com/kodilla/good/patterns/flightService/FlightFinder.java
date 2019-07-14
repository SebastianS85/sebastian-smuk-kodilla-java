package com.kodilla.good.patterns.flightService;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FlightFinder {

    private List<Flight> flightsBoard = new ArrayList<>();
    private HashMap<Integer, Flight> availableConnectingFlights = new HashMap<>();
    private HashMap<Integer, Flight> availableDirectFlights = new HashMap<>();


    public FlightFinder() {
        flightsBoard.add(new Flight("Gdansk", "Katowice", 123));
        flightsBoard.add(new Flight("Gdansk", "Katowice", 1883));
        flightsBoard.add(new Flight("Katowice", "Berlin", 189));
        flightsBoard.add(new Flight("Gdansk", "Wroclaw", 579));
        flightsBoard.add(new Flight("Katowice", "Berlin", 180));
        flightsBoard.add(new Flight("Wroclaw", "Berlin", 559));


    }


    public HashMap<Integer, Flight> findDirectConnection(String flightFrom, String flightTo) {

        System.out.println("Searching direct flights...");

        for (Flight flight : flightsBoard) {
            if (flight.getTravelFrom().equals(flightFrom) && flight.getTravelTo().equals(flightTo)) {
                availableDirectFlights.put(flight.getFlightNumber(), flight);
            }
        }

        return availableDirectFlights;
    }

    public HashMap<Integer, Flight> findAllConnections(String flightFrom) {
        HashMap<Integer, Flight> allFlights = new HashMap<>();
        for (Flight flight : flightsBoard) {
            if (flight.getTravelFrom().equals(flightFrom)) {
                allFlights.put(flight.getFlightNumber(), flight);

            }
        }
        return allFlights;
    }

    public HashMap<Integer, Flight> findConnectedFlights(String flightFrom, String flightTo) {
        System.out.println("Searching connected flights...");
        for (Flight flight : findAllConnections(flightFrom).values()) {
            for (Flight flight1 : findAllConnections(flight.getTravelTo()).values()) {
                if (flight1.getTravelTo().equals(flightTo)) {
                    availableConnectingFlights.put(flight.getFlightNumber(), flight);
                    availableConnectingFlights.put(flight1.getFlightNumber(), flight1);
                }

            }
        }

        return availableConnectingFlights;
    }
}