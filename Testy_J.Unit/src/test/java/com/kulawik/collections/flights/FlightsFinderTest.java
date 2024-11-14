package com.kulawik.collections.flights;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightsFinderTest {

    @Test
    void findFlightsFrom() {
        //given
        FlightsFinder flightsFinder = new FlightsFinder();
        //then
        List<Flight> flightsFromTokio = flightsFinder.findFlightsFrom("Tokio");
        //then
        assertEquals(1,flightsFromTokio.size());
        assertTrue(flightsFromTokio.contains(new Flight("Tokio", "Sydney")));
        assertFalse(flightsFromTokio.contains(new Flight("Tokio","Rome")));
    }

    @Test
    void findFlightsTo() {
        //given
        FlightsFinder flightsFinder = new FlightsFinder();
        //when
        List<Flight>flightsToParis =flightsFinder.findFlightsTo("Paris");
        //them
        assertEquals(2,flightsToParis.size());
        assertTrue(flightsToParis.contains(new Flight("Warsaw", "Paris")));
        assertTrue(flightsToParis.contains(new Flight("New York", "Paris")));
    }

    @Test
    void findFlightFromNonExistingDeparture(){
        //given
        FlightsFinder flightsFinder = new FlightsFinder();
        //when
        List<Flight>flightFromCracow = flightsFinder.findFlightsFrom("Cracow");
        //then
        assertEquals(0,flightFromCracow.size());
        assertFalse(flightFromCracow.contains(new Flight("Cracow", "Berlin")));
        assertTrue(flightFromCracow.isEmpty());
    }
    @Test
    void findFlightToNonExistingArrival(){
        //given
        FlightsFinder flightsFinder = new FlightsFinder();
        //when
        List<Flight>flightToNapoli = flightsFinder.findFlightsTo("Napoli");
        //then
        assertEquals(0,flightToNapoli.size());
        assertTrue(flightToNapoli.isEmpty());
    }
}