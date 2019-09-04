package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mi_to_kms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_to_kms);

        Button btn_miles = (Button)findViewById(R.id.submit_miles);
        btn_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Declaring different fields.
                EditText edtmiles = findViewById(R.id.edt_miles);
                TextView resultTextKms = (TextView)findViewById(R.id.result_kms);

                //Fetching text from Edittext
                String miles = edtmiles.getText().toString();

                //Converting into double for math.
                double milesInDouble = Double.parseDouble(miles);
                double milestokms = milesInDouble*1.60934;
                String finalMiles = Double.toString(milestokms);

                //Setting the textview to result.
                resultTextKms.setText(finalMiles + " Kilometeres.");

                Toast.makeText(mi_to_kms.this, "Thank You for using the app!", Toast.LENGTH_SHORT).show();

            }
        });

     Button backbtn1 = (Button)findViewById(R.id.backbtn1);
     backbtn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(mi_to_kms.this, MainActivity.class));
         }
     });
    }
}
