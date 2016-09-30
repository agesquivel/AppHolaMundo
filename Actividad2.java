package com.example.superuser.appholamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Actividad2 extends AppCompatActivity {

    public static String nombreUsuario = "txtUsuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        TextView txtBienvenida = (TextView) findViewById(R.id.txtBienvenida);

        String usr = getIntent().getStringExtra("txtUsuario");
        txtBienvenida.setText(txtBienvenida.getText().toString() + " " + usr);
    }
}
