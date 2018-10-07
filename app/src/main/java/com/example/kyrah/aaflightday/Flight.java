package com.example.kyrah.aaflightday;

import java.util.List;

/**
 * Created by TheGoodElf on 10/7/18.
 */

public class Flight {
    Gate gate;
    String departuredate;
    String departuretime;
    String arrivaltime;
    String arrivaldate;
    Integer price;
    Integer flightNumber;
    String origin;
    String destination;
    Integer aircraftType;
    Boolean flightStatus;



    public void Flight(Gate gate, String departuretdate, String departuretime, String arrivaldate, String arrivaltime, Integer price, Integer flightNumber, String origin, String destination, Integer aircraftType, Boolean flightStatus){
        this.gate = gate;
        this.departuredate = departuretdate;
        this.departuretime = departuretime;
        this.arrivaldate = arrivaldate;
        this.arrivaltime = arrivaltime;
        this.price = price;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination =destination;
        this.aircraftType = aircraftType;
        this.flightStatus = flightStatus;

    }

    public Gate getGate() {
        return gate;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getAircraftType() {
        return aircraftType;
    }

    public Boolean getFlightStatus() {
        return flightStatus;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAircraftType(Integer aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setFlightStatus(Boolean flightStatus) {
        this.flightStatus = flightStatus;
    }

    public List<PointOfInterest> findLocalPOIs() {
        return Airport.getTerminal(this.gate.getConcourseLabel()).getPOIList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "gate=" + gate +
                ", departuredate='" + departuredate + '\'' +
                ", departuretime='" + departuretime + '\'' +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", arrivaldate='" + arrivaldate + '\'' +
                ", price=" + price +
                ", flightNumber=" + flightNumber +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", aircraftType=" + aircraftType +
                ", flightStatus=" + flightStatus +
                '}';
    }

}
