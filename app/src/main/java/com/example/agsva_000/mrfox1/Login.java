package com.example.agsva_000.mrfox1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView textViewTitulo;
    EditText etEntrar, etContraseña;
    Button botonEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        textViewTitulo = (TextView)findViewById(R.id.textViewTitulo);
        etEntrar = (EditText) findViewById(R.id.etEntrar);
        etContraseña = (EditText) findViewById(R.id.etContraseña);
        botonEntrar = (Button) findViewById(R.id.botonEntrar);

        String font_path = "font/AmaticSC-Regular.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        textViewTitulo.setTypeface(TF);
        etEntrar.setTypeface(TF);
        etContraseña.setTypeface(TF);
        botonEntrar.setTypeface(TF);

        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonEntrar.setBackgroundColor(Color.parseColor("#848484"));
                Intent intent = new Intent(Login.this, ScrollingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
