package com.example.android.sunshine.app;

/**
 * Created by Pankaj on 10/9/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.id.list;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] foreCastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/75",
                "Sat - Help Trapped in weather station - 68/51",
                "Sun - Sunny 80/68"
        };

        List<String> weekForeCast =new ArrayList<String>(Arrays.asList(foreCastArray));
        ArrayAdapter<String> mAdapter;
        View rootView = inflater.inflate(R.layout.list_item_forecast, container, false);
        ListView listView=(ListView)rootView.findViewById(R.id.listview_forecast_textView);
        mAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, android.R.id.text1, weekForeCast);
        listView.setAdapter(mAdapter);
        return rootView;
    }
}