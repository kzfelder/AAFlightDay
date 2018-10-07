package com.example.kyrah.aaflightday;

public class Gate {
    Character concourse;

    //Flight awaitingFlight;
    //Flight nextFlight;

    public Gate(char concourse /*Terminal terminal*/) {
        this.concourse = concourse;
    }

    private Character getConcourse() {
        return concourse;
    }

}
