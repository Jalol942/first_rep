package com.example.mexmonxona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class restaranzakazActivity extends AppCompatActivity {

    String file = "myfile";
    private String fileContents;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button zakaz=findViewById(R.id.ovqatbuyurishbutton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaranzakaz);

        Button button_30 = findViewById(R.id.button10);

        button_30.setOnClickListener(new View.OnClickListener() {
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
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                fileContents="1 odamli joy 30 000 som"+"\n"+temp;

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
            }
        });
    }
}
