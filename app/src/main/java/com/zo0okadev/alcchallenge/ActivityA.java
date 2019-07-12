package com.zo0okadev.alcchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;

public class ActivityA extends AppCompatActivity implements View.OnClickListener {

    private Button aboutButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        aboutButton = findViewById(R.id.about_alc_button);
        aboutButton.setOnClickListener(this);
        profileButton = findViewById(R.id.my_profile_button);
        profileButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.about_alc_button:
                openActivityB();
                break;
            case R.id.my_profile_button:
                openActivityC();
                break;
        }
    }

    private void openActivityC() {
        Intent intent = new Intent(ActivityA.this, ActivityC.class);
        startActivity(intent);
    }

    private void openActivityB() {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }
}
