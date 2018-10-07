package com.example.kyrah.aaflightday;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terminal {

    Random rand = new Random();
    List<Gate> gates;
    List<PointOfInterest> poiList;

    public List<Gate> getGatesInfo() {
        return this.gates;
    }

    public List<PointOfInterest> getPoiInfo() {return  this.poiList; }

    public void addGates(Gate... gates) {
        for (Gate gate : gates) {
            this.gates.add(gate);
        }
    }

    public void addGates(List<Gate> gates) {
        this.gates = gates;
    }

    public void addPOIs(PointOfInterest... pois) {
        for (PointOfInterest poi : pois) {
            this.poiList.add(poi);
        }
    }

    public void addPOIs(List<PointOfInterest> pois) {
        this.poiList = pois;
    }

    public void generateRandomGates() {
        List<Gate> gates = new ArrayList<>();
        EnumClasses letters = new EnumClasses();
        int numGates = rand.nextInt(10);
        for (int i = 0; i < numGates; i++) {
            gates.add(new Gate(letters.getLetterAtIndex(i)));
        }
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public void generateRandomPOIs() {
        List<PointOfInterest> poiList = new ArrayList<>();
        EnumClasses POIType = new EnumClasses();
        int numPOI = rand.nextInt(5);
        for (int i = 0; i < numPOI; i++) {
            String type = POIType.randomPOIType();
            String name = POIType.randomPOINameFromType(type);
            PointOfInterest newPOI = new PointOfInterest(name, type);
            poiList.add(newPOI);
        }

    }
}
