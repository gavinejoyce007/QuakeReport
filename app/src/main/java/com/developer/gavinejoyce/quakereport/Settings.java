package com.developer.gavinejoyce.quakereport;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle b2 = getIntent().getExtras();
        String a,b,c;
        double d;

            a = b2.getString("title");
            b = b2.getString("nop");
            c = b2.getString("ps");
            d = b2.getDouble("mag");
            String maag = Double.toString(d);

            TextView titleTextView = (TextView) findViewById(R.id.title);
            titleTextView.setText(a);

            TextView tsunamiTextView = (TextView) findViewById(R.id.number_of_people);
            tsunamiTextView.setText(b);

            TextView magnitudeTextView = (TextView) findViewById(R.id.perceived_magnitude);
            magnitudeTextView.setText(maag);


        /*seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                String pro = Integer.toString(progress);
                Toast.makeText(getApplicationContext(),pro,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/


    }

}
