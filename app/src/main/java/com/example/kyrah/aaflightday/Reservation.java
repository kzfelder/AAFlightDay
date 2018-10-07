package com.example.kyrah.aaflightday;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Reservation {
    JSONObject reservation;

    public JSONObject getReservation() {
        return reservation;
    }

    public void setReservation(JSONObject reservation) {
        this.reservation = reservation;
    }

    public JSONArray getFlightData(JSONObject reservation) throws JSONException {
        return reservation.getJSONArray("flights");
    }

    public String getDestinationCode(JSONArray flights) throws JSONException {
        JSONObject flightInfo = flights.getJSONObject(0);
        return flightInfo.get("destination").toString();
    }
}
