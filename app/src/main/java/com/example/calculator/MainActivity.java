package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1, editTextNumber2;
    Button buttonPlus, buttonSub, buttonMul, buttonDiv;
    TextView textViewResult;
    int num1, num2;

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

        num1 = Integer.parseInt(editTextNumber1.getText().toString());
        num2 = Integer.parseInt(editTextNumber2.getText().toString());

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResult.setText("Sum of numbers is = " + (num1 + num2));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResult.setText("Difference of numbers is = " + (num1 - num2));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResult.setText("Product of numbers is = " + (num1 * num2));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResult.setText("Division of numbers is = " + (num1 / num2));
            }
        });
    }
}