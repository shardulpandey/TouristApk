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

public class rashtrapati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rash);

        ArrayList<place> listOfPlaces = new ArrayList<>();

        listOfPlaces.add(new place (R.drawable.rash1,"Location","Western end, rajpath, delhi"));
        listOfPlaces.add(new place (R.drawable.rash2,"Made By","British Govt."));
        listOfPlaces.add(new place (R.drawable.rash3,"Since","1916"));
        listOfPlaces.add(new place (R.drawable.rash4,"Area","Rajpath"));


        final placeAdapter adapter = new placeAdapter(this,listOfPlaces);

        final ListView listView = (ListView) findViewById(R.id.rashistView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView header = (TextView) view.findViewById(R.id.descriptionTextView);

                String str = header.getText().toString();

                Toast.makeText(rashtrapati.this, str, Toast.LENGTH_SHORT).show();


                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Intent j = new Intent(rashtrapati.this, ViewMore.class);
                        startActivity(j);
                    }
                });
            }
        });
    }
}
