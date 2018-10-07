package com.example.kyrah.aaflightday;

public class Gate {
    String concourse;
    Integer gateNumber;

    //Flight awaitingFlight;
    //Flight nextFlight;

    public Gate(Integer gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setConcourse(String concourse) {
        this.concourse = concourse;
    }

    public String getConcourseLabel() {
        return concourse;
    }

    @Override
    public String toString() {
        return concourse.toString() + gateNumber;
    }

    public Integer getGateNumber() {
        return this.gateNumber;
    }
}

