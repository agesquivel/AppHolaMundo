package com.example.superuser.appholamundo;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView edTxtSaludo = (TextView) this.findViewById(R.id.edtSaludo);
        edTxtSaludo.setText("Texto Cambiado");
        edTxtSaludo.setTextColor(Color.RED);

        Toast.makeText(this, "La actividad se creó",Toast.LENGTH_LONG).show();
        Log.i("MiActividad", "Se ejecutó el método onCreate");
    }

    //Controlar de evento del click del botón Aceptar
    //public void onClick(View v){
    public void validarUsuario(View control){
        Intent itUsaAct2 = new Intent(this, Actividad2.class);

        EditText edtUsr = (EditText) this.findViewById(R.id.edtUsuario);
        EditText edtPasswd = (EditText) this.findViewById(R.id.edtPasswd);

        if ((edtUsr.getText().toString().equals("admin"))
                && (edtPasswd.getText().toString().equals("1234"))){

            itUsaAct2.putExtra(Actividad2.nombreUsuario, edtUsr.getText().toString());
            startActivity(itUsaAct2);
        }
    }

}
