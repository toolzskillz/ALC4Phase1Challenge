package com.andela.alc4_phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about_andela(View view) {
        startActivity(new Intent(getApplicationContext(), ActivityB.class));
    }

    public void my_profile(View view) {
        startActivity(new Intent(getApplicationContext(), ActivityC.class));
    }
}
