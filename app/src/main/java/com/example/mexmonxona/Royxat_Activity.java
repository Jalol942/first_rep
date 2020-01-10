package com.example.mexmonxona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;

import android.view.View;
import android.widget.*;


public class Royxat_Activity extends AppCompatActivity {
    private Button writeText,readText;
    private EditText enterText;
    private String file ="myfile";
    private String fileContents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royxat_);

        writeText=findViewById(R.id.writeText);
        readText=findViewById(R.id.readText);
        enterText=findViewById(R.id.enterText);
        final TextView showText=findViewById(R.id.showText);

        writeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp="";
                try {
                    FileInputStream fIn=openFileInput(file);
                    int c;

                    while ((c=fIn.read())!= -1)
                    {
                        temp=temp+Character.toString((char)c);
                    }
                    showText.setText(temp);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                fileContents=enterText.getText().toString()+"\n"+temp;

                try {
                    FileOutputStream fOut = openFileOutput(file,MODE_PRIVATE);
                    fOut.write(fileContents.getBytes());
                    fOut.close();
                    File fileDir = new File(getFilesDir(),file);
                    Toast.makeText(getBaseContext(),"File Saved at" +fileDir, Toast.LENGTH_LONG).show();
                }
                catch (Exception  e ){
                    e.printStackTrace();
                }
                enterText.setText("");
            }

        });

        readText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fIn=openFileInput(file);
                    int c;
                    String temp="";

                    while ((c=fIn.read())!= -1)
                    {
                     temp=temp+Character.toString((char)c);
                    }
                    showText.setText(temp);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}