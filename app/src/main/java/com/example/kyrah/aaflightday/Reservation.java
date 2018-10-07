package com.example.kyrah.aaflightday;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Reservation {
    JSONObject reservation;
    String TAG = "ReservationClass";

    public JSONObject getReservation() {
        return reservation;
    }

    public void setReservation(JSONObject reservation) {
        this.reservation = reservation;
        Log.i(TAG, "Reservation information set.");
    }

    public JSONArray getFlightData(JSONObject reservation) throws JSONException {
        return reservation.getJSONArray("flights");
    }

    public String getDestinationCode(JSONArray flights) throws JSONException {
        JSONObject flightInfo = flights.getJSONObject(0);
        return flightInfo.get("destination").toString();
    }
}
