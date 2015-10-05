package com.rahul.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_spotify_streamer;
    Button btn_scores_app;
    Button btn_library_app;
    Button btn_build_it_bigger;
    Button btn_xyz_reader;
    Button btn_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_spotify_streamer=(Button)findViewById(R.id.btn_spotify_streamer);
        btn_scores_app=(Button)findViewById(R.id.btn_scores_app);
        btn_library_app=(Button)findViewById(R.id.btn_library_app);
        btn_build_it_bigger=(Button)findViewById(R.id.btn_build_it_bigger);
        btn_xyz_reader=(Button)findViewById(R.id.btn_xyz_reader);
        btn_capstone=(Button)findViewById(R.id.btn_capstone);



        btn_spotify_streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Spotify Streamer");

            }
        });

        btn_scores_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Scores App");

            }
        });

        btn_library_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Library App");

            }
        });

        btn_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Build it bigger");

            }
        });


        btn_xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("xyz reader");

            }
        });



        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Capstone Project");

            }
        });









    }

    public void displayToast(String message)
    {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
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
