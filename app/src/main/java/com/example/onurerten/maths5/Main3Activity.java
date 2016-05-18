package com.example.onurerten.maths5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void sendMessage2(View view) {
        Intent goToNextActivity = new Intent(getApplicationContext(), Main4Activity.class);
        startActivity(goToNextActivity);
    }
}
