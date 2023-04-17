package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1, editTextNumber2;
    Button buttonPlus, buttonSub, buttonMul, buttonDiv;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.Number1);
        editTextNumber2 = findViewById(R.id.Number2);
        buttonPlus = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSubtract);
        buttonMul = findViewById(R.id.buttonMultiply);
        buttonDiv = findViewById(R.id.buttonDivide);
        textViewResult = findViewById(R.id.result);
    }
}