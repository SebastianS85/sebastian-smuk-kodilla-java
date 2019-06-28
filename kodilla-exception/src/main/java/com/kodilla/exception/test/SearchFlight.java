package com.kodilla.exception.test;

public class SearchFlight {
    public static void main(String[] args) {

        Flight flight3=new Flight("Krakow","Helsinki");
        AirportApp myAirport =new AirportApp();

        try{myAirport.findFight(flight3);

        }catch (RouteNotFoundException e){
            System.out.println("No Connection");
        }finally {
            System.out.println("Search done!!");
        }

    }
}
