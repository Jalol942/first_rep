package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OvqatlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovqatlar);
        Button palovbutton=findViewById(R.id.palovbutton);
        palovbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OvqatlarActivity.this,PalovActivity.class));
            }
        });
        Button tuxumbarakbutton=findViewById(R.id.tuxumbarakbutton);
        tuxumbarakbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OvqatlarActivity.this,TuxumbarakActivity.class));
            }
        });
        Button mantibutton=findViewById(R.id.mantibutton);
        mantibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OvqatlarActivity.this,MantiActivity.class));
            }
        });
        Button chuchvara=findViewById(R.id.chuchvarabutton);
        chuchvara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OvqatlarActivity.this,ChuchvaraActivity.class));
            }
        });
    }
}
