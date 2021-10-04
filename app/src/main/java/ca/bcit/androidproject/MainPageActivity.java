package ca.bcit.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void onSeaLevelClick(View view) {
        Intent i = new Intent(this, SeaLevelHistroyActivity.class);
        startActivity(i);
    }

    public void onInformationClick(View view) {
        Intent i = new Intent(this, InformationActivity.class);
        startActivity(i);
    }

    public void onGlobalSeaLevelClick(View view) {
        Intent i = new Intent(this, GlobalSeaLevelActivity.class);
        startActivity(i);
    }
}