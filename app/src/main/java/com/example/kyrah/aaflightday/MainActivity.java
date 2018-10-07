package com.example.kyrah.aaflightday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String confirmation = getIntent().getStringExtra("confirmation");
        if(!validConfirmation(confirmation)){
        }
        else{
            getFlightData(confirmation);
        }
        getFlightData(confirmation);
    }

    public void getFlightData(String conf){
        String url = "https://xuwcd.herokuapp.com/reservation?recordLocator=" + conf;

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                            new Reservation().setReservation(response);
                        Log.i(TAG, response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

// Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }

    public boolean validConfirmation(String conf){
        if(conf.contains("NIGRWW")){ //This condition is a placeholder.
            return true;
        }
        return false;
    }

}
