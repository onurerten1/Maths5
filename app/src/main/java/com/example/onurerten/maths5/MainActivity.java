package com.example.onurerten.maths5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void sendMessage(View view) {
        Intent goToNextActivity = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(goToNextActivity);
    }
}
