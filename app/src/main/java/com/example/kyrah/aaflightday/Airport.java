package com.example.kyrah.aaflightday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Airport {
    String id;
    String code;
    String name;
    String city;
    String stateCode;
    String countryName;
    String countryCode;
    Map<String, Terminal> terminals = new HashMap<>();

    public Airport(String airportCode){

    }

    public void generateNewTerminals(){

    }

    public Terminal getTerminal(String concourse) {
        return terminals.get(concourse);
    }
}

}
