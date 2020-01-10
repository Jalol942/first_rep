package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XizmatlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xizmatlar);
        Button ovqatxizmat=findViewById(R.id.ovqatxizmatibutton);
        ovqatxizmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XizmatlarActivity.this,Ovqat_XizmatiActivity.class));
            }
        });
Button restaranxizmat=findViewById(R.id.Restaranxizmatibutton);
restaranxizmat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(XizmatlarActivity.this,RestaranXizmatActivity.class));
    }
});
Button xonaxizmat=findViewById(R.id.Xonaxizmatbutton);
xonaxizmat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(XizmatlarActivity.this,XonaxizmatActivity.class));
    }
});

Button zakaz = findViewById(R.id.xonaxizmatbuttonzakaz);
zakaz.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        startActivity(new Intent(XizmatlarActivity.this,ZakazActivity.class));

    }
});
    }
}
