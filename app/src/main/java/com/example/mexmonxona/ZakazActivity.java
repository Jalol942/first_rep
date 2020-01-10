package com.example.mexmonxona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;

public class ZakazActivity extends AppCompatActivity {

    String file = "myfile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakaz);
        TextView textView = findViewById(R.id.zakaz_view);

        try {
            FileInputStream fIn=openFileInput(file);
            int c;
            String temp="";

            while ((c=fIn.read())!= -1)
            {
                temp=temp+Character.toString((char)c);
            }
            textView.setText(temp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
