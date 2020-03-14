package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText currrencyText;
private TextView result;
private Button amount_Button;
    @Override
    protected void onCreate(Bundle currency) {
        super.onCreate(currency);
        setContentView(R.layout.activity_main);
    }

    public void amount(View view)
    {
           Log.i("info ", "button is pressed ");
           currrencyText = (EditText) findViewById(R.id.amount);
      //  currrencyText.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "12")});

        String amountdollar  = currrencyText.getText().toString();
           double amountindollers = Double.parseDouble(amountdollar);
           double amountrp = amountindollers*155.5;
           String amountinstring = String.format("%.2f",amountindollers);
           result = (TextView) findViewById(R.id.showresult);
           result.setText("Amount in dollers : "+amountdollar + "\n" + "Amoumt in Ruppes " + amountdollar );
           Toast.makeText(this, "Amount " +amountdollar, Toast.LENGTH_SHORT).show();
    }
}
