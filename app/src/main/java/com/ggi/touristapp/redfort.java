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

public class redfort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redfort);

        ArrayList<place> listOfPlaces = new ArrayList<>();

        listOfPlaces.add(new place (R.drawable.redf1,"Location","Center Of Delhi"));
        listOfPlaces.add(new place (R.drawable.redf2,"Made by","Shah Jahan"));
        listOfPlaces.add(new place (R.drawable.redf3,"Since","1639"));
        listOfPlaces.add(new place (R.drawable.redf4,"Area","Old Delhi"));


        final placeAdapter adapter = new placeAdapter(this,listOfPlaces);

        final ListView listView = (ListView) findViewById(R.id.redfortlist);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView header = (TextView) view.findViewById(R.id.descriptionTextView);

                String str = header.getText().toString();

                Toast.makeText(redfort.this, str, Toast.LENGTH_SHORT).show();

                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Intent j = new Intent(redfort.this, ViewMore.class);
                        startActivity(j);
                    }
                });

            }
        });
    }

    }

