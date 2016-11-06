package com.example.reno.comunicacionactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Reno on 02/11/2016.
 */

public class NewActivity extends Activity {

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("usuario");
        int i = extras.getInt("edad");
        String texto = extras.getString("texto");
        TextView tv2 = (TextView)findViewById(R.id.textView2);
        tv2.setText("Hola "+ texto);
    }

    public void lanzaIntent(View view){
        finish();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("edad", 27);
        i.putExtra("resultado", "Aceptado!");
        startActivity(i);
    }

    public void lanzaIntent2(View view){
        finish();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("edad", 27);
        i.putExtra("resultado", "Rechazado!");
        startActivity(i);
    }

}
