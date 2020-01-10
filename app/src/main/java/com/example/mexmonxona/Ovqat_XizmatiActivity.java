package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ovqat_XizmatiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovqat__xizmati);
        Button ovqatbuyursh=findViewById(R.id.ovqatbuyurishbutton);
        ovqatbuyursh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ovqat_XizmatiActivity.this,ovqatzakazActivity.class));
            }
        });
    }
}
