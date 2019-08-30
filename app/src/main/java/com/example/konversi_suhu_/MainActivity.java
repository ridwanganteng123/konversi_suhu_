package com.example.konversi_suhu_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText celci,kel,fer,rea;
    private Button konversi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Suhu");

        celci = (EditText) findViewById(R.id.celci);
        kel = (EditText) findViewById(R.id.kel);
        fer = (EditText) findViewById(R.id.fer);
        rea = (EditText) findViewById(R.id.rea);
       konversi = (Button) findViewById(R.id.konversi);
       konversi.setOnClickListener(this);
       konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String celcius = celci.getText().toString().trim();

                double c = Double.parseDouble(celcius);

                double k = c + 273;
                double f = 1.8 * c + 32;
                double r = 0.8 * c;

                kel.setText(String.valueOf(k)+"");
                fer.setText(String.valueOf(f)+"");
                rea.setText(String.valueOf(r)+"");


            }

        });
    }

    @Override
    public void onClick(View view) {

    }
}
