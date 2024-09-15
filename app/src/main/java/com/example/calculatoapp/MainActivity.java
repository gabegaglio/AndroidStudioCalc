package com.example.calculatoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnSub,btnMult,btnDiv,
            btnDot, btnClear, btnOne,
            btnTwo, btnThree, btnFour,
            btnFive, btnSix, btnSeven,
            btnEight, btnNine, btnEqual,
            btnZero;

    Double num1, num2;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); //sets content view to main activity

        btnAdd=findViewById(R.id.btnAdd);
        btnDiv=findViewById(R.id.btnDiv);
        btnMult=findViewById(R.id.btnMult);
        btnSub=findViewById(R.id.btnSub);
        btnEqual=findViewById(R.id.btnEqual);
        btnDot=findViewById(R.id.btnDot);
        btnClear=findViewById(R.id.btnClear);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        tvResult=findViewById(R.id.tvResult);

        Clicklistener();
    }

    public void Clicklistener(){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
            String equation = tvResult.getText().toString();
            tvResult.setText(equation+"+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"-");
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"/");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"5");

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"9");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+".");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                tvResult.setText(equation+"0");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String equation = tvResult.getText().toString();
                String[] terms = equation.split("(?=[-+*/])|(?<=[-+*/])");
                Double result = Double.parseDouble(terms[0].trim()); //allows us to start at i=1

                for (int i=1;i<terms.length;i+=2) { //every two terms will be an operator
                    String operator = terms[i].trim();
                    double num = Double.parseDouble(terms[i + 1].trim());
                    //even though we're on operator, i+1 gets number after

                    switch (operator) {
                        case "+":
                            result += num;
                            tvResult.setText(String.valueOf(result));
                            break;
                        case "-":
                            result-=num;
                            tvResult.setText(String.valueOf(result));
                            break;
                        case "/":
                            result/=num;
                            tvResult.setText(String.valueOf(result));
                            break;
                        case "*":
                            result*=num;
                            tvResult.setText(String.valueOf(result));
                            break;
                    }
                }
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}