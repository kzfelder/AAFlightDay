package com.example.kyrah.aaflightday;

public class Gate {
    String concourse;
    Integer terminal;

    //Flight awaitingFlight;
    //Flight nextFlight;

    public Gate(String concourse /*Terminal terminal*/) {
        this.concourse = concourse;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    private String getConcourse() {
        return concourse;
    }

    @Override
    public String toString() {
        return terminal.toString() + concourse;
    }
}

