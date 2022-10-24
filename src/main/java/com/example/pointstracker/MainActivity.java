package com.example.pointstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView players;
    int numberOfPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button add = findViewById(R.id.addButton);
        //Button sub = findViewById(R.id.minusButton);
        players = findViewById(R.id.totalPlayerTextView);
    }

    public void addPlayer (View view){

        String text = players.getText().toString();
        int textNumber = Integer.valueOf(text);
        if (textNumber == 4){
            Toast.makeText(this, "Cannot add more players!", Toast.LENGTH_SHORT).show();
        }
        textNumber++;
        text = String.valueOf(textNumber);
        if (textNumber <5){
            players.setText(text);
        }
        MediaPlayer sound = MediaPlayer.create(this, R.raw.add);
        sound.start();
    }

    public void subPlayer (View view){

        String text = players.getText().toString();
        int textNumber = Integer.valueOf(text);
        textNumber--;
        text = String.valueOf(textNumber);
        if (textNumber >0){
            players.setText(text);
        }
        MediaPlayer sound = MediaPlayer.create(this, R.raw.add);
        sound.start();
    }

    public void done (View view){
        String text = players.getText().toString();
        numberOfPlayers = Integer.valueOf(text);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("value",numberOfPlayers);
        startActivity(intent);
    }
}