package com.example.reno.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("resultado");

    }

    public void lanzaIntent(View view){
        Intent i = new Intent(this, NewActivity.class);
        i.putExtra("usuario", "Pepito Perez");
        i.putExtra("edad", 27);
        EditText et1 = (EditText)findViewById(R.id.editText);
        System.out.println(et1.getText());
        i.putExtra("texto", et1.getText().toString());
        startActivity(i);
    }
}
