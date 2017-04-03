package com.developer.gavinejoyce.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Gavine on 17-08-2016.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0 , earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);
        DecimalFormat formatter = new DecimalFormat("0.0");
        String output = formatter.format(currentEarthquake.getmMagnitude());
        magnitudeView.setText(output);

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        TextView locationOffset = (TextView) listItemView.findViewById(R.id.location_offset);
        String loc = currentEarthquake.getmLocation();
        if(loc.contains("of")) {
            String[] s1 = loc.split("of ");
            String part1 = s1[0];
            String part2 = s1[1];
            locationOffset.setText(part1);
            locationView.setText(part2);
        }
        else
        {
            String s2="Near by ";
            locationOffset.setText(s2);
            locationView.setText(loc);
        }



        Date dateObject = new Date(currentEarthquake.getmDate());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);


        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();
        double mm = currentEarthquake.getmMagnitude();
        double magnitudeColor = mm;
        int magnitudeC = (int)mm;
        if(magnitudeColor >=0 && magnitudeColor <2)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude1);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=2 && magnitudeColor <3)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude2);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=3 && magnitudeColor <4)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude3);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=4 && magnitudeColor <5)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude4);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=5 && magnitudeColor <6)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude5);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=6 && magnitudeColor <7)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude6);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=7 && magnitudeColor <8)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude7);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=8 && magnitudeColor <9)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude8);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=9 && magnitudeColor <10)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude9);
            magnitudeCircle.setColor(magnitudeC);
        }
        else if(magnitudeColor >=10)
        {
            magnitudeC= ContextCompat.getColor(getContext(), R.color.magnitude10plus);
            magnitudeCircle.setColor(magnitudeC);
        }


        return listItemView;

    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatMagnitude(double mag)
    {
        DecimalFormat formatter = new DecimalFormat("0.00");
        String output = formatter.format(mag);
        return output;
    }


}
