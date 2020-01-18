package com.androidshowtime.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityJava extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView = findViewById(R.id.result_text);
        button = findViewById(R.id.roll_button);
        //OnClickListener in Java
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //use setText() method
              //  textView.setText("Fanadez");
            }
        });
    }
}
