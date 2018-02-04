package com.example.android.farah_1202152322_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mMenu, mBanyakPorsi;
    Button mButtonEatbus, mButtonApnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = findViewById(R.id.menu);
        mBanyakPorsi = findViewById(R.id.porsi);
        mButtonEatbus = findViewById(R.id.button1);
        mButtonApnormal = findViewById(R.id.button2);

        mButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("tempatmakan", "EATBUS");
                intent.putExtra("menu", mMenu.getText().toString());
                intent.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                intent.putExtra("totalharga", "50000");
                startActivity(intent);
            }
        });

        mButtonApnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("tempatmakan", "APNORMAL");
                intent.putExtra("menu", mMenu.getText().toString());
                intent.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                intent.putExtra("totalharga", "30000");
                startActivity(intent);
            }
        });

    }
}
