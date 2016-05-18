package com.example.onurerten.maths5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void sendMessage1(View view) {
        Intent goToNextActivity = new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(goToNextActivity);

    }
}
