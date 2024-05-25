package com.fernando.mendoza.laboratoriorecuperacioncalificado02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio01Activity extends AppCompatActivity {

    private ImageView imageView;
    private Button mostrarButton;
    private Button ocultarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio01);

        imageView = findViewById(R.id.imageView);
        mostrarButton = findViewById(R.id.btnMostrar);
        ocultarButton = findViewById(R.id.btnOcultar);

        mostrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
            }
        });

        ocultarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.GONE);
            }
        });
    }
}
