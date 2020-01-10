package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XonalarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xonalar);
        Button birxonabutton=findViewById(R.id.bir_xona_button);
        birxonabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XonalarActivity.this,BirxonaActivity.class));
            }
        });
Button ikkixonabutton=findViewById(R.id.ikki_xona_button);
ikkixonabutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(XonalarActivity.this,IkkixonaActivity.class));
    }
});
Button lyukxonabutton=findViewById(R.id.lyuks_xona_button);
lyukxonabutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(XonalarActivity.this,LyuksxonaActivity.class));
    }
});
    }
}
