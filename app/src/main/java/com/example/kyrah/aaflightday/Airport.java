package com.example.kyrah.aaflightday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Airport {
    Random rand = new Random();
    EnumClasses alphabet = new EnumClasses();
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
        int numTerminals = rand.nextInt(26);
        for (int i = 0; i < numTerminals; i++) {
            String letter = alphabet.getLetterAtIndex(i);
            terminals.put(letter, new Terminal(letter));
        }
    }

    public Terminal getTerminal(String concourse) {
        return terminals.get(concourse);
    }
}

