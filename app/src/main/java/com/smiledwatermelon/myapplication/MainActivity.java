package com.smiledwatermelon.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this is test note
        setContentView(R.layout.activity_main);

        Button rollingButton;
        rollingButton = findViewById(R.id.rollButton);
        final ImageView leftDice, rightDice;
        leftDice = findViewById(R.id.DiceLeft);
        rightDice = findViewById(R.id.DiceRight);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};


        rollingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO :make some animation for dices before set its final values
                Log.d("dicee", "ze button pressed");

                Random randNumberGenerator = new Random();
                int randInt = randNumberGenerator.nextInt(10) + 3;
                for (int i = 0; i < randInt; i++) {
                    Log.d("dicee", "ze number is " + randInt);

                    leftDice.setImageResource(diceArray[randNumberGenerator.nextInt(6)]);
                    rightDice.setImageResource(diceArray[randNumberGenerator.nextInt(6)]);


                }

            }

        });
    }
}
