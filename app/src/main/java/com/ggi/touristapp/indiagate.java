package com.ggi.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class indiagate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiagate);

        ArrayList<place> listOfPlaces = new ArrayList<>();

        listOfPlaces.add(new place (R.drawable.india1,"Location","Rajpath, Delhi, India"));
        listOfPlaces.add(new place (R.drawable.india2,"Made by","Duke of Connaught"));
        listOfPlaces.add(new place (R.drawable.india3,"Since","1917"));
        listOfPlaces.add(new place (R.drawable.india4,"Area","Rajpath"));


        final placeAdapter adapter = new placeAdapter(this,listOfPlaces);

        final ListView listView = (ListView) findViewById(R.id.indiagatelist);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView header = (TextView) view.findViewById(R.id.descriptionTextView);

                String str = header.getText().toString();

                Toast.makeText(indiagate.this, str, Toast.LENGTH_SHORT).show();


                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Intent j = new Intent(indiagate.this, ViewMore.class);
                        startActivity(j);
                    }
                });

            }
        });
    }

}