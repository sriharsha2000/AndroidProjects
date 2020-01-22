package com.sriharsha.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button up, down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        up = findViewById(R.id.countUp);
        down = findViewById(R.id.countDown);
        tv = findViewById(R.id.tv);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(tv.getText().toString());
                n++;
                tv.setText(String.valueOf(n));
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(tv.getText().toString());
                n--;
                tv.setText(String.valueOf(n));
            }
        });
    }
}
