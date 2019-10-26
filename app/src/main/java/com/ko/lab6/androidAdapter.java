package com.ko.lab6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class androidAdapter extends ArrayAdapter<androidVersion> {
   private Context context;
   private int resources;


    public androidAdapter(@NonNull Context context, int resource, @NonNull List<androidVersion> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resources = resource;
    }

    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {

        int logo = getItem(i).getLogo();
        String name = getItem(i).getName();
        String country = getItem(i).getcCountry();
        String industry = getItem(i).getcIndustry();
        String CEO = getItem(i).getcCEO();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resources, parent, false);

        ImageView img = convertView.findViewById(R.id.logo);
        TextView companyName = convertView.findViewById(R.id.id);
        TextView cCountry = convertView.findViewById(R.id.country);
        TextView cIndustry = convertView.findViewById(R.id.industry);
        TextView cCEO = convertView.findViewById(R.id.CEO);

        img.setImageResource(logo);
        companyName.setText(name);
        cCountry.setText("Country: " + country);
        cIndustry.setText("Industry: " + industry);
        cCEO.setText("CEO: " + CEO);
        return convertView;
    }
}
