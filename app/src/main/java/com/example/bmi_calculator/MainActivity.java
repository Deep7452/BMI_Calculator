package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
                                                   //Initialize the veriable
EditText weight,height;
TextView result;
String calculation,BMIResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
                                                  // Retriving the value entered by the user*/
        String b1 = weight.getText().toString();
        String b2 = height.getText().toString();
                                                // Type casting
        float weightValue = Float.parseFloat(b1);
        float heightValue = Float.parseFloat(b2) / 100;

        float bmi = weightValue /(heightValue * heightValue);    // Formula used for calculation

        if(bmi < 16){
            BMIResult = "Severely Under weight";
        }else if(bmi < 18.5){
            BMIResult = "UnderWeighted";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            BMIResult= "Normal(Healdhy weight)";
        }else if(bmi >=25 && bmi <=29.9){
            BMIResult = "Over Weight";
        }else{
            BMIResult = "Obese";
        }
        calculation = "Result:\n\n" + bmi + "\n" + BMIResult;
        result.setText(calculation);

    }
}