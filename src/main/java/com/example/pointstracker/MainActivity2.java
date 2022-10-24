package com.example.pointstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView firstPlayer;
    TextView secondPlayer;
    TextView thirdPlayer;
    TextView fourthPlayer;
    int numberOfPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        numberOfPlayers = intent.getIntExtra("value", 1);

        firstPlayer = findViewById(R.id.firstPerson);
        secondPlayer = findViewById(R.id.secondPerson);
        thirdPlayer = findViewById(R.id.thirdPerson);
        fourthPlayer = findViewById(R.id.fourthPerson);
        Button button = findViewById(R.id.doneSecond);

        if (numberOfPlayers == 1){
            firstPlayer.setVisibility(View.VISIBLE);
            button.animate().translationYBy(-300f);
        }
        if (numberOfPlayers == 2){
            firstPlayer.setVisibility(View.VISIBLE);
            secondPlayer.setVisibility(View.VISIBLE);
            button.animate().translationYBy(-200f);
        }
        if (numberOfPlayers == 3){
            firstPlayer.setVisibility(View.VISIBLE);
            secondPlayer.setVisibility(View.VISIBLE);
            thirdPlayer.setVisibility(View.VISIBLE);
            button.animate().translationYBy(-100f);
        }
        if (numberOfPlayers == 4){
            firstPlayer.setVisibility(View.VISIBLE);
            secondPlayer.setVisibility(View.VISIBLE);
            thirdPlayer.setVisibility(View.VISIBLE);
            fourthPlayer.setVisibility(View.VISIBLE);
        }
    }

    public void startGame(View view){
        if (numberOfPlayers == 1){
            Intent intentToStartGame = new Intent(this, GameActivity1.class);
            intentToStartGame.putExtra("First",firstPlayer.getText().toString());
            startActivity(intentToStartGame);
        }
        if (numberOfPlayers == 2){
            Intent intentToStartGame = new Intent(this, GameActivity2.class);
            intentToStartGame.putExtra("First",firstPlayer.getText().toString());
            intentToStartGame.putExtra("Second",secondPlayer.getText().toString());
            startActivity(intentToStartGame);
        }
        if (numberOfPlayers == 3){
            Intent intentToStartGame = new Intent(this, GameActivity3.class);
            intentToStartGame.putExtra("First",firstPlayer.getText().toString());
            intentToStartGame.putExtra("Second",secondPlayer.getText().toString());
            intentToStartGame.putExtra("Third", thirdPlayer.getText().toString());
            startActivity(intentToStartGame);
        }
        if (numberOfPlayers == 4){
            Intent intentToStartGame = new Intent(this, GameActivity3.class);
            intentToStartGame.putExtra("First",firstPlayer.getText().toString());
            intentToStartGame.putExtra("Second",secondPlayer.getText().toString());
            intentToStartGame.putExtra("Third", thirdPlayer.getText().toString());
            intentToStartGame.putExtra("Fourth", fourthPlayer.getText().toString());
            startActivity(intentToStartGame);
        }

    }
}