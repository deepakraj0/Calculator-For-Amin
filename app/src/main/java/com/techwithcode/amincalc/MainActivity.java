package com.techwithcode.amincalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumberDecimal);
        textView= findViewById(R.id.textView2);
        button= findViewById(R.id.button);

    }


    public void calc(View view){
        Toast.makeText(this, "Powered by DYSoftware", Toast.LENGTH_SHORT).show();
        String s;
        s= editText.getText().toString();
        Double kadi=0.0;
        Double foot;
        Double inch;
        Double jarib;
        if(!s.isEmpty())
            try {
                 kadi = Double.parseDouble(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        inch= kadi*7.92;
        foot= (kadi *7.92)/12;
        jarib= kadi/100;
        textView.setText("Value in Foot = "+foot+"\nValue in Inch = "+inch+"\nValue in Jarib = "+jarib);


    }
}