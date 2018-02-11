package com.example.wai.abreak;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout background;
    Button btnGreen, btnBlue, btnTimerStart, btnTimerEnd;
    Chronometer simpleChronometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.background);
        Button btnGreen = (Button) findViewById(R.id.btnGreen);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);
        final Button btnTimerS = (Button) findViewById(R.id.btnTimerStart);
        final Button btnTimerE = (Button) findViewById(R.id.btnTimerEnd);
        final Chronometer simpleChronometer = (Chronometer) findViewById(R.id.simpleChronometer);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Setting the background to green", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                background.setBackgroundColor(Color.parseColor("#00ff00"));

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Setting the background to blue", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                background.setBackgroundColor(Color.parseColor("#006699"));

            }
        });

        btnTimerS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.setBase(SystemClock.elapsedRealtime());
                simpleChronometer.start();

            }
        });
        btnTimerE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleChronometer.stop();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
