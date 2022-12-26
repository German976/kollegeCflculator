package com.example.calcultor;

import androidx.appcompat.app.  AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    TextView lr;
    Button btn_add;
    Button btn_subtract;
    Button btn_multiplay;
    Button btn_divide;
    Button btn_sin;
    Button btn_cos;
    Button btn_tan;
    Button btn_sqrt;
    Button btn_pow;
    double number_one;
    double number_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add= findViewById(R.id.button_add);
        btn_subtract = findViewById(R.id.button_subtract);
        btn_multiplay = findViewById(R.id.button_Multiplay);
        btn_divide = findViewById(R.id.button_Divide);
        btn_sin = findViewById(R.id.button_sin);
        btn_cos = findViewById(R.id.button_cos);
        btn_tan = findViewById(R.id.button_tan);
        btn_sqrt = findViewById(R.id.button_sqrt);
        btn_pow = findViewById(R.id.button_pow);
        ta = findViewById(R.id.number1);
        tb = findViewById(R.id.number2);
        lr = findViewById(R.id.textView_result);


        final Context x = this;

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = number_one + number_two;
                lr.setText(result.toString());
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = number_one - number_two;
                lr.setText(result.toString());
            }
        });

        btn_multiplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = number_one * number_two;
                lr.setText(result.toString());
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                if(number_two == 0){
                    Toast.makeText(x,"На 0 делить нельзя", Toast.LENGTH_LONG).show();

                }else{
                    Double result = number_one / number_two;
                    lr.setText(result.toString());
                }
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = Math.sin(number_one);
                lr.setText(result.toString());
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = Math.cos(number_one);
                lr.setText(result.toString());
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = Math.tan(number_one);
                lr.setText(result.toString());
            }
        });

        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                if(number_one < 0){
                    Toast.makeText(x,"Корень не может быть отрицательным!", Toast.LENGTH_LONG).show();
                }else{
                    Double result = Math.sqrt(number_one);
                    lr.setText(result.toString());
                }
            }
        });

        btn_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseNumbers();
                Double result = Math.pow(number_one, number_two);
                lr.setText(result.toString());
            }
        });
    }

    private void parseNumbers(){
        final Context x = this;
        if(!ta.getText().toString().isEmpty() && !tb.getText().toString().isEmpty()){
            number_one = Integer.parseInt(ta.getText().toString());
            number_two = Integer.parseInt(tb.getText().toString());
        }else{
            Toast.makeText(x,"Поля не должны быть пустыми!", Toast.LENGTH_LONG).show();
        }
    }


}