package com.blogspot.codeentity.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button add,sub,mul,div;
    private EditText first,second,ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.firsttxt);
        second = findViewById(R.id.secondtxt);
        ans = findViewById(R.id.answertxt);
        add = findViewById(R.id.plusbtn);
        sub = findViewById(R.id.minusbtn);
        mul = findViewById(R.id.mulbtn);
        div = findViewById(R.id.divbtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Float fval = Float.parseFloat(first.getText().toString());
             Float sval = Float.parseFloat(second.getText().toString());

             Float res;
             res = fval + sval;
             ans.setText(Float.toString(res));
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float fval = Float.parseFloat(first.getText().toString());
                Float sval = Float.parseFloat(second.getText().toString());

                Float res;
                res = fval - sval;
                ans.setText(Float.toString(res));
            }
        });



        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float fval = Float.parseFloat(first.getText().toString());
                Float sval = Float.parseFloat(second.getText().toString());

                Float res;
                res = fval * sval;
                ans.setText(Float.toString(res));
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float fval = Float.parseFloat(first.getText().toString());
                Float sval = Float.parseFloat(second.getText().toString());

                Float res;
                res = fval / sval;
                ans.setText(Float.toString(res));
            }
        });


    }
}
