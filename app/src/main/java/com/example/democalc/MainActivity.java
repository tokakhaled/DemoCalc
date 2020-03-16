package com.example.democalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView tv;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et_fnum);
        et2 = (EditText) findViewById(R.id.et_snum);
        tv = (TextView) findViewById(R.id.tv_result);
        btn1 = (Button) findViewById(R.id.btn_sum);
        btn2 = (Button) findViewById(R.id.btn_sub);
    }
//    public void sum(View view) {
//        Double num1=Double.parseDouble( et1.getText().toString());
//        Double num2=Double.parseDouble( et2.getText().toString());
//        Double result=num1+num2;
//        tv.setText(String.valueOf(result));
//    }
//    public void sub(View view) {
//        Double num1=Double.parseDouble( et1.getText().toString());
//        Double num2=Double.parseDouble( et2.getText().toString());
//        Double result=num1-num2;
//        tv.setText(result.toString());
//    }
}

