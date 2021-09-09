package com.example.trasulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersForList = new Intent(MainActivity. this,NumbersActivity.class);
                startActivity(numbersForList);

            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyMembers = new Intent(MainActivity.this,FamilyActivity2.class);
                startActivity(familyMembers);

            }
        });

        TextView aboutColors = (TextView) findViewById(R.id.colors);
        aboutColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ClickOnColor = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(ClickOnColor);
            }
        });

        TextView aboutPhases = (TextView) findViewById(R.id.phrases);
        aboutPhases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ClickOnPhases = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(ClickOnPhases);
            }
        });
    }

   /* public void openNumberActivity(View view) {
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }*/
}