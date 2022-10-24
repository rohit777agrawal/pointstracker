package com.example.pointstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity1 extends AppCompatActivity {

    TextView points;
    ImageView background;
    String firstPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        firstPerson = intent.getStringExtra("First");

        TextView playerName = findViewById(R.id.playerNameTextView);
        playerName.setText(firstPerson);
        points = findViewById(R.id.pointsTextView1);
        background = findViewById(R.id.gameImageView1);
    }

    public void gain (View view){
        int value = changeLookAdd() + 1;
        points.setText(String.valueOf(value));
    }

    public void addFive (View view){
        int value = changeLookAdd() + 5;
        points.setText(String.valueOf(value));
    }

    public void addTen (View view){
        int value = changeLookAdd() + 10;
        points.setText(String.valueOf(value));
    }

    public int changeLookAdd (){
        background.setImageResource(R.drawable.green);
        background.animate().rotation(400f).setDuration(2000);
        return Integer.valueOf(points.getText().toString());
    }


    public  void loss (View view){
        int value = changeLookSub() - 1;
        points.setText(String.valueOf(value));
    }

    public void subFive (View view){
        int value = changeLookSub() - 5;
        points.setText(String.valueOf(value));
    }

    public void subTen (View view){
        int value = changeLookSub() - 10;
        points.setText(String.valueOf(value));
    }

    public int changeLookSub (){
        background.setImageResource(R.drawable.red);
        background.animate().rotation(-800f).setDuration(2000);
        return Integer.valueOf(points.getText().toString());
    }

}