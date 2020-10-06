package com.example.helloandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView greeting;
    EditText enterName;
    Button sayHelloButton;
    Button positiveButton;
    Button negativeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        greeting = findViewById(R.id.hello_text_view);
        sayHelloButton = findViewById(R.id.say_hello_button);
        enterName = findViewById(R.id.enter_name_edit_text);
        positiveButton = findViewById(R.id.positive_button);
        negativeButton = findViewById(R.id.negative_button);

        sayHelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterName.getText().toString();
                if (name.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    greeting.setText("Hello " + name + "!");
                }
            }
        });

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This is a positive message",
                        Toast.LENGTH_SHORT ).show();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This is a negative message",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}