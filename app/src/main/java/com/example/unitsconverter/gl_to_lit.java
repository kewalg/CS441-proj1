package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gl_to_lit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_to_lit);

        Button btn_gallons = (Button)findViewById(R.id.submit_gallons);
        btn_gallons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Declaring different fields.
                EditText edtgallons = findViewById(R.id.edt_gallons);
                TextView resultInLit = (TextView)findViewById(R.id.result_kms);

                //Fetching text from Edittext
                String gallons = edtgallons.getText().toString();

                //Converting into double for math.
                double gallonsInDouble = Double.parseDouble(gallons);
                double gltolit = gallonsInDouble*3.78541;
                String finallit = Double.toString(gltolit);

                //Setting the textview to result.
                resultInLit.setText(finallit + " Litres.");

                Toast.makeText(gl_to_lit.this, "Thank You for using the app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backbtn2 = (Button)findViewById(R.id.backbtn2);
        backbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gl_to_lit.this, MainActivity.class));
            }
        });
    }
}
