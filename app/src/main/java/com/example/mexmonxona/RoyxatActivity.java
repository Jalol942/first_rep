package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RoyxatActivity extends AppCompatActivity {
    private Button btnSaqlash,btnBarchaDelete;
    private ListView lvKontaktlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royxat);
        btnSaqlash=(Button)findViewById(R.id.btnSaqlash);
        btnBarchaDelete=(Button)findViewById(R.id.btnBarchaDelete);
        lvKontaktlar=(ListView)findViewById(R.id.lvKontaktlar);
        btnSaqlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           startActivity(new Intent(RoyxatActivity.this,KontaktSaqlash.class));
            }
        });


    }
}
