package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XonaxizmatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xonaxizmat);
        Button yangixona=findViewById(R.id.yangixonabutton);
        yangixona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XonaxizmatActivity.this,xonazakazActivity.class));
            }
        });
        Button xonaxizmatchi=findViewById(R.id.xonaxizmatchibutton);
        xonaxizmatchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XonaxizmatActivity.this,XonaxizmatchisiActivity.class));
            }
        });
    }
}
