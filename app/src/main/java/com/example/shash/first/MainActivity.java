package com.example.shash.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText E1,E2;
    Button B1,B2,B3,B4;
    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=findViewById(R.id.num1);
        E2=findViewById(R.id.num2);
        B1=findViewById(R.id.button1);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);
        B4=findViewById(R.id.button4);
        T1=findViewById(R.id.textView);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1,num2,res;
                num1 = Double.parseDouble(E1.getText().toString());
                num2=Integer.parseInt(E2.getText().toString());
                res=num1+num2;
                T1.setText(Double.toString(res));
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1,num2,res;
                num1 = Double.parseDouble(E1.getText().toString());
                num2=Double.parseDouble(E2.getText().toString());
                res=num1-num2;
                T1.setText(Double.toString(res));
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1,num2,res;
                num1 = Double.parseDouble(E1.getText().toString());
                num2=Double.parseDouble(E2.getText().toString());
                res=num1*num2;
                T1.setText(Double.toString(res));
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1, num2, res;
                num1 = Double.parseDouble(E1.getText().toString());
                num2=Double.parseDouble(E2.getText().toString());
                if(num2 == 0){
                    T1.setText("Infinity");
                }
                res=(double)num1/num2;
                T1.setText(Double.toString(res));
            }
        });
    }
}
