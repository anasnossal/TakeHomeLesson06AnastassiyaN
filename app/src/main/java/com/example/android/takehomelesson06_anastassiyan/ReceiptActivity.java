package com.example.android.takehomelesson06_anastassiyan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {
    TextView one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);


    one = (TextView) findViewById(R.id.receipt_summary);

    Intent intent = getIntent();
    TipCalculator myCalc = (TipCalculator) intent.getSerializableExtra(Keys.TIP_KEY);
       one.setText(myCalc.toString());
}
}

