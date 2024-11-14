package com.kulawik.collections.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight>getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw","Paris"));
        flights.add(new Flight("New York","Paris"));
        flights.add(new Flight("Los Angeles","Barcelona"));
        flights.add(new Flight("Tokio","Sydney"));
        flights.add(new Flight("London","Rome"));
        return flights;


    }
}
