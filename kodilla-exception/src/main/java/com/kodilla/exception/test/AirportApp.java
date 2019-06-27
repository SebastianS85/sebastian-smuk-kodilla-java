package com.kodilla.exception.test;

import java.util.HashMap;

public class AirportApp {

    public void findFight(Flight flight) throws RouteNotFoundException{

        HashMap<String,Boolean> airportsAvailable= new HashMap<>();
        airportsAvailable.put("Wroclaw",false);
        airportsAvailable.put("Krakow",true);
        airportsAvailable.put("Berlin",true);
        airportsAvailable.put("New York",false);

        if(airportsAvailable.containsKey(flight.getArrivalAirport())&&airportsAvailable
                .containsKey(flight.getDepartureAirport())){
           System.out.println("Flight available");
        }
        else {
            throw new RouteNotFoundException();
        }
    }
}
