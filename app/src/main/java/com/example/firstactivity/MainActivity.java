package com.example.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String _mateo = "state";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //RESOURCES -> res/layout/activity_main.xml
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(_mateo,"START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(_mateo,"RESUME");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(_mateo,"PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(_mateo,"STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(_mateo,"RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(_mateo,"DESTROY");

    }
}
