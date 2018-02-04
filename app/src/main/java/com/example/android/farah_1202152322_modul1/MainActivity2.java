package com.example.android.farah_1202152322_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView mtempatmakan;
    TextView mmenu;
    TextView mbanyakporsi;
    TextView mtotalharga;
    private  final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mtempatmakan = findViewById(R.id.tempatmakan);
        mmenu = findViewById(R.id.makanan);
        mbanyakporsi = findViewById(R.id.totalporsi);
        mtotalharga = findViewById(R.id.totalharga);

        Intent intent = getIntent();

        String namatempat = intent.getStringExtra("namatempat");
        String menu = intent.getStringExtra("menu");
        String jumlahporsi = intent.getStringExtra("jumlahporsi");
        String totalharga = intent.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

        mtempatmakan.setText(namatempat);
        mmenu.setText(menu);
        mbanyakporsi.setText(jumlahporsi);
        mtotalharga.setText(String.valueOf(totalHarga));

        if (totalHarga <= uang){
            Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
