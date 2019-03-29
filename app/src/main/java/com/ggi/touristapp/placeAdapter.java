package com.ggi.touristapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ggi.touristapp.R;
import com.ggi.touristapp.place;


import java.util.ArrayList;

public class placeAdapter extends ArrayAdapter<place> {

    public placeAdapter(@NonNull Context context, ArrayList<place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        place p1 = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.placeImageView);
        img.setImageResource(p1.getImage_Data());

        TextView header = (TextView) convertView.findViewById(R.id.headerTextView);
        header.setText(p1.getName());

        TextView des = (TextView) convertView.findViewById(R.id.descriptionTextView);
        des.setText(p1.getDescription());

        return convertView;
    }
}
