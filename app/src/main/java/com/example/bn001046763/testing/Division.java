package com.example.bn001046763.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {
    int a,b,c,sum;
    EditText number1;
    EditText number2;
    TextView number3;
    Button equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        number1 = (EditText)findViewById(R.id.num1);
        number2 = (EditText)findViewById(R.id.num2);
        number3 = (TextView)findViewById(R.id.num3);
        equals = (Button)findViewById(R.id.equal);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                sum = a/b;
                number3.setText(Integer.toString(sum));

            }
        });
    }
}
