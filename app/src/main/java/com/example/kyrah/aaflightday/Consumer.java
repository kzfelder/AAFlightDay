package com.example.kyrah.aaflightday;

import java.util.ArrayList;

/**
 * Created by TheGoodElf on 10/7/18.
 */

public class Consumer {
    String confirmation;
    ArrayList<Flight> flights;

    public void Consumer(String conf){
        confirmation = conf;
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public ArrayList<Flight> getFlights(){
        return flights;
    }
}
