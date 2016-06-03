package com.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTestTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTestTV = (TextView) findViewById(R.id.text);
        Typeface tf = FontCache.get("fonts/MavenPro-Regular.ttf", this);
        mTestTV.setTypeface(tf);
        mTestTV.setText("Save typeface use");
    }

}
