package com.example.reno.comunicacionactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    }

    public void lanzaIntent(View view){
        finish();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("usuario", "Pepito Perez");
        i.putExtra("edad", 27);
        startActivity(i);
    }

}
