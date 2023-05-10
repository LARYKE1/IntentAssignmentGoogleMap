package com.example.intentassignmentgooglemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Renton Location 47.489483126426315, -122.17570570496878


        btn=(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri restaurantsUri= Uri.parse("geo:47.489483126426315, -122.17570570496878?q=restaurants");
                Intent inte=new Intent(Intent.ACTION_VIEW, restaurantsUri);
                inte.setPackage("com.google.android.apps.maps");
                startActivity(inte);
            }
        });
        btn2=(Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri text= Uri.parse("geo:47.489483126426315, -122.17570570496878?q=gas");
                Intent inte=new Intent(Intent.ACTION_VIEW, text);
                inte.setPackage("com.google.android.apps.maps");
                startActivity(inte);
            }
        });



    }
}