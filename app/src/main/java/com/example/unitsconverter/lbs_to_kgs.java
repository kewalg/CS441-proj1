package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class lbs_to_kgs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbs_to_kgs);

        Button btn_lbs = (Button) findViewById(R.id.submit_pounds);
        final TextView resultInKgs = (TextView) findViewById(R.id.result_kgs);
        resultInKgs.setVisibility(View.GONE);

        btn_lbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                resultInKgs.setVisibility(View.VISIBLE);

                //Declaring different fields.
                EditText edtlbs = findViewById(R.id.edt_pounds);
                TextView resultInKgs = (TextView) findViewById(R.id.result_kgs);

                //Fetching text from Edittext
                String pounds = edtlbs.getText().toString();

                //Converting into double for math.
                double poundsInDouble = Double.parseDouble(pounds);
                double lbstokgs = poundsInDouble * 0.45;
                String finalkgs = Double.toString(lbstokgs);

                //Setting the textview to result.
                resultInKgs.setText(finalkgs + " Kilograms.");

                Toast.makeText(lbs_to_kgs.this, "Thank You for using the app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backbtn3 = (Button) findViewById(R.id.backbtn3);
        backbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lbs_to_kgs.this, MainActivity.class));
            }
        });
    }
}
