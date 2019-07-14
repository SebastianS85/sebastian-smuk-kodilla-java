package com.kodilla.good.patterns.flightService;

public class Travel {
    private String travelFrom;
    private String travelTo;

    public Travel(String travelFrom, String travelTo) {
        this.travelFrom = travelFrom;
        this.travelTo = travelTo;
    }

    public String getTravelFrom() {
        return travelFrom;
    }

    public String getTravelTo() {
        return travelTo;
    }


}
