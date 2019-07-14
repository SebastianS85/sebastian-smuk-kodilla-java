package com.kodilla.good.patterns.flightService;

public class Flight extends Travel {

    private int flightNumber;

    public Flight(String travelFrom, String travelTo, int flightNumber) {
        super(travelFrom, travelTo);
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + " " + getTravelFrom() + "  " + getTravelTo();

    }
}