package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        buttonPlus.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (editTextNumber1.getText().toString().equals(""))
        {
            textViewResult.setText("Please Enter 1st Number");
        }

        if (editTextNumber2.getText().toString().equals(""))
        {
            textViewResult.setText("Please Enter 2nd Number");
        }

        num1 = Integer.parseInt(editTextNumber1.getText().toString());
        num2 = Integer.parseInt(editTextNumber2.getText().toString());

        if(view.getId() == R.id.buttonAdd)
        {
            textViewResult.setText("Sum of the Numbers = " + (num1 + num2));
        }
        else if(view.getId() == R.id.buttonSubtract)
        {
            textViewResult.setText("Difference of the Numbers = " + (num1 - num2));
        }
        else if(view.getId() == R.id.buttonMultiply)
        {
            textViewResult.setText("Product of the Numbers = " + (num1 * num2));
        }
        else if(view.getId() == R.id.buttonDivide)
        {
            textViewResult.setText("Division of the Numbers = " + (num1 / num2));
        }
    }
}