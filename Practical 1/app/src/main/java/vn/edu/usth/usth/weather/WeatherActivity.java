package vn.edu.usth.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForcastFragment firstFragment = new ForcastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        Log.i("Weather", "onStart() called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Weather", "onResume() called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Weather", "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Weather", "onStop() called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Weather", "onDestroy() called");
        super.onDestroy();
    }
}