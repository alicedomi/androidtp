package com.example.alice.alicedom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alice on 08/03/2017.
 */

public class Activity2 extends AppCompatActivity {
    private Button Valider;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2);
        Valider = (Button) findViewById(R.id.valider);

        Valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextNActivity();
            }
        });
    }

    private void goToNextNActivity() {
        Intent intent2 = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent2);
    }

}
