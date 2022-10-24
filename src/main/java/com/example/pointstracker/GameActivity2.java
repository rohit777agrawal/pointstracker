package com.example.pointstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity2 extends AppCompatActivity {

    TextView points1;
    TextView points2;
    ImageView background1;
    ImageView background2;
    String firstPerson;
    String secondPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        firstPerson = intent.getStringExtra("First");
        secondPerson = intent.getStringExtra("Second");

        TextView playerName2 = findViewById(R.id.playerNameTextView);
        TextView playerName1 = findViewById(R.id.playerNameTextView2);
        playerName1.setText(firstPerson);
        playerName2.setText(secondPerson);
        points1 = findViewById(R.id.pointsTextView1);
        points2 = findViewById(R.id.pointsTextView2);
        background1 = findViewById(R.id.gameImageView1);
        background2 = findViewById(R.id.gameImageView2);
    }

    public void gain1 (View view){
        int value = changeLookAdd1() + 1;
        points1.setText(String.valueOf(value));
    }
    public void gain2 (View view){
        int value = changeLookAdd2() + 1;
        points2.setText(String.valueOf(value));
    }


    public void addFive1 (View view){
        int value = changeLookAdd1() + 5;
        points1.setText(String.valueOf(value));
    }
    public void addFive2 (View view){
        int value = changeLookAdd2() + 5;
        points2.setText(String.valueOf(value));
    }

    public void addTen1 (View view){
        int value = changeLookAdd1() + 10;
        points1.setText(String.valueOf(value));
    }
    public void addTen2 (View view){
        int value = changeLookAdd2() + 10;
        points2.setText(String.valueOf(value));
    }

    public int changeLookAdd1 (){
        background1.setImageResource(R.drawable.greenhw);
        background1.animate().rotation(700f).setDuration(1000);
        return Integer.valueOf(points1.getText().toString());
    }

    public int changeLookAdd2 (){
        background2.setImageResource(R.drawable.greenhw);
        background2.animate().rotation(700f).setDuration(1000);
        return Integer.valueOf(points2.getText().toString());
    }



    public void loss1 (View view){
        int value = changeLookSub1() - 1;
        points1.setText(String.valueOf(value));
    }
    public void loss2 (View view){
        int value = changeLookSub2() - 1;
        points2.setText(String.valueOf(value));
    }


    public void subFive1 (View view){
        int value = changeLookSub1() - 5;
        points1.setText(String.valueOf(value));
    }
    public void subFive2 (View view){
        int value = changeLookSub2() - 5;
        points2.setText(String.valueOf(value));
    }

    public void subTen1 (View view){
        int value = changeLookSub1() - 10;
        points1.setText(String.valueOf(value));
    }
    public void subTen2 (View view){
        int value = changeLookSub2() - 10;
        points2.setText(String.valueOf(value));
    }

    public int changeLookSub1 (){
        background1.setImageResource(R.drawable.redhw);
        background1.animate().rotation(200f).setDuration(1000);
        return Integer.valueOf(points1.getText().toString());
    }

    public int changeLookSub2 (){
        background2.setImageResource(R.drawable.redhw);
        background2.animate().rotation(200f).setDuration(1000);
        return Integer.valueOf(points2.getText().toString());
    }
}