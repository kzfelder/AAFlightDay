package com.example.kyrah.aaflightday;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by TheGoodElf on 10/7/18.
 */

public class POIList extends ListActivity{

    ArrayList<PointOfInterest> places;
    OnPOISelectedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poilist);
        /*An activity with access to the gate needs to do the putExtra method (using Intent)
        to send the gate here. An example of this can be seen in the Login and Response Activities.
         */
        String gate = getIntent().getStringExtra("gate");
        places = new ArrayList<>();
        //Still need to give that ArrayList some values. Use the gate to get the nearby POIs.
        ArrayAdapter<PointOfInterest> adapter = new ArrayAdapter<PointOfInterest>
                (this, R.layout.poilist);
        setListAdapter(adapter);
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        PointOfInterest p = places.get(position);
        listener.onPOISelected(p);
    }

    public interface OnPOISelectedListener {
        void onPOISelected(PointOfInterest p);
    }
}