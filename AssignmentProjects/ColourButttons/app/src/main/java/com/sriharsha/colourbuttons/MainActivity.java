package com.sriharsha.colourbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button redButton, greenButton, blueButton;
    RelativeLayout layout;
    int ri, gi, bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redButton = findViewById(R.id.redButton);
        blueButton = findViewById(R.id.blueButton);
        greenButton = findViewById(R.id.greenButton);
        layout = findViewById(R.id.layout);
        ri = 0;
        gi = 0;
        bi = 0;
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ri++;
                Handler handler = new Handler();
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        ri = 0;
                    }
                };
                if(ri==1)
                    handler.postDelayed(r, 250);
                else if(ri==2)
                {
                    ri = 0;
                    layout.setBackgroundResource(R.color.red);
                }
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gi++;
                Handler handler = new Handler();
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        gi = 0;
                    }
                };
                if(gi==1)
                    handler.postDelayed(r, 250);
                else if(gi==2) {
                    gi = 0;
                    layout.setBackgroundResource(R.color.green);
                }
            }
        });
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bi++;
                Handler handler = new Handler();
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        bi = 0;
                    }
                };
                if(bi==1)
                    handler.postDelayed(r, 250);
                else if(bi==2) {
                    bi = 0;
                    layout.setBackgroundResource(R.color.blue);
                }
            }
        });
    }
}
