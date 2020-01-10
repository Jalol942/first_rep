package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kirish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirish);
        final Button Xonalarbutton=findViewById(R.id.Xonalar_button);
        Xonalarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kirish.this,XonalarActivity.class));
            }
        });
final Button Xizmatlarbutton=findViewById(R.id.Xizmatlar_button);
Xizmatlarbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Kirish.this,XizmatlarActivity.class));
    }
});
Button Ovqatlarbutton=findViewById(R.id.Ovqatlar_button);
Ovqatlarbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Kirish.this,OvqatlarActivity.class));
    }
});
Button royxatbutton=findViewById(R.id.royxat_button);
        royxatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kirish.this,RoyxatActivity.class));
            }
        });
        Button royxat=findViewById(R.id.royxaatt_button);
        royxat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kirish.this,Royxat_Activity.class));
            }
        });

    }
}
