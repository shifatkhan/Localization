package com.shifatkhan.localisation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Opens google maps on button click
    public void showMap(View view) {
        Uri geoLocation = Uri.parse("geo:0,0?q=" + getResources().getString(R.string.country));
        Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);

        // Make the Intent explicit by setting the Google Maps package
        intent.setPackage("com.google.android.apps.maps");

        startActivity(intent);
    }
}
