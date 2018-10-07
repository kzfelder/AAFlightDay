package com.example.kyrah.aaflightday;

import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextClock;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class ResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String confirmation = getIntent().getStringExtra("confirmation");
        if(!validConfirmation(confirmation)){
            buildGUI();
        }
        else{
            getFlightData(confirmation);
            buildGUI2();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public void buildGUI(){
        RelativeLayout thisLayout = new RelativeLayout(this);
        TextView sorry = new TextView(this);
        sorry.setText("Sorry; this is not a valid confirmation number.");
        sorry.setTextSize(20);
        sorry.setY(500);
        sorry.setX(20);
        thisLayout.addView(sorry);
        TextView help = new TextView(this);
        help.setText("Call 800-433-7300 for assistance.");
        help.setY(1000);
        help.setX(250);
        help.setTextSize(18);
        thisLayout.addView(help);
        setContentView(thisLayout);
    }

    public void buildGUI2(){
        RelativeLayout trueLayout = new RelativeLayout(this);
        trueLayout.setBackground(getDrawable(R.drawable.login_backg));
        ScrollView scroll = new ScrollView(this);
        trueLayout.addView(scroll);
        TextView timeHeading = new TextView(this);
        timeHeading.setText("Time until your next flight:");
        timeHeading.setTextSize(20);
        timeHeading.setTypeface(Typeface.DEFAULT_BOLD);
        timeHeading.setTypeface(Typeface.SANS_SERIF);
        trueLayout.addView(timeHeading);
        setContentView(trueLayout);
    }

    public boolean validConfirmation(String conf){
        if(conf.contains("NIGRWW")){ //This condition is a placeholder.
            return true;
        }
        return false;
    }

    public void getFlightData(String conf){
        final TextView tv = findViewById(R.id.testTV);
        String url = "https://xuwcd.herokuapp.com/reservation?recordLocator=" + conf;

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        new Reservation().setReservation(response);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }
}
