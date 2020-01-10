package com.example.mexmonxona;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class KontaktSaqlash extends AppCompatActivity {
private EditText etIsm,etRaqam,etEmail;
private Button btnMijozsaqlash;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kontakt_saqlash);
        etIsm =(EditText)findViewById(R.id.etIsm);
        etRaqam =(EditText)findViewById(R.id.etRaqam);
        etEmail =(EditText)findViewById(R.id.etEmail);
        btnMijozsaqlash=(Button)findViewById(R.id.btnMijozsaqlash);

    }
}
