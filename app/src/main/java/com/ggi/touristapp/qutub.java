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

public class qutub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qutub);


    ArrayList<place> listOfPlaces = new ArrayList<>();

        listOfPlaces.add(new place (R.drawable.qutub1,"Location","Mehrauli, Delhi"));
        listOfPlaces.add(new place (R.drawable.qutub2,"Made by","Qutub ud din aibak"));
        listOfPlaces.add(new place (R.drawable.qutub3,"Since","1192"));
        listOfPlaces.add(new place (R.drawable.qutub4,"Area","Mehrauli"));


    final placeAdapter adapter = new placeAdapter(this,listOfPlaces);

    final ListView listView = (ListView) findViewById(R.id.qutubView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            TextView header = (TextView) view.findViewById(R.id.descriptionTextView);

            String str = header.getText().toString();

            Toast.makeText(qutub.this, str, Toast.LENGTH_SHORT).show();

            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent j = new Intent(qutub.this, ViewMore.class);
                    startActivity(j);
                }
            });


        }
    });
}
}
