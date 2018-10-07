package com.example.kyrah.aaflightday;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"ALL", "unused"})
public class PointOfInterest {
    String name;
    Integer waitTime;
    List<Gate> nearestGates;
    String type;
    //List<Product> products;

    public PointOfInterest(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public void setNearestGates(Gate... gates) {
        this.nearestGates = nearestGates;
        for (Gate gate : gates) {
            this.nearestGates.add(gate);
        }
        System.out.println();
    }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public Integer getWaitTime() { return waitTime; }

    public List<Gate> getNearestGates() { return nearestGates; }

    public String getType() { return type.toString(); }

    /*
    public List<Product> getProducts() {
        return products;
    }
    */


    @Override
    public String toString() {
        return name + " | " +
                type + " | " +
                "wait time: " + waitTime + " minutes.";
    }
}
