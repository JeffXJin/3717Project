package ca.bcit.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }

    public void onCausesClick(View view) {
        Intent i = new Intent(this, CausesActivity.class);
        startActivity(i);
    }

    public void onPreventionClick(View view) {
        Intent i = new Intent(this, PreventionActivity.class);
        startActivity(i);
    }

    public void onContributeClick(View view) {
        Intent i = new Intent(this, ContributeActivity.class);
        startActivity(i);
    }
}