package org.iesfm.formularioconpantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.PublicKey;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvName;
    private TextView tvSurname;
    private TextView tvAge;
    private TextView tvCarnet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inicializarValores();

        Intent pantallaPrincipal = getIntent();

        String name = pantallaPrincipal.getStringExtra(MainActivity.FORMULARIO_CON_PANTALLAS_NAME);
        String surname = pantallaPrincipal.getStringExtra(MainActivity.FORMULARIO_CON_PANTALLAS_SURNAME);
        String age = pantallaPrincipal.getStringExtra(MainActivity.FORMULARIO_CON_PANTALLAS_AGE);
        String carnet = pantallaPrincipal.getStringExtra(MainActivity.FORMULARIO_CON_PANTALLAS_CARNET);

        tvName.setText(name);
        tvSurname.setText(surname);
        tvAge.setText(age);
        tvCarnet.setText(carnet);
    }

    public void inicializarValores() {
        tvName = (TextView) findViewById(R.id.tvNombreIntroducido);
        tvSurname = (TextView) findViewById(R.id.tvApellidoIntroducido);
        tvAge = (TextView) findViewById(R.id.tvEdadIntroducida);
        tvCarnet = (TextView) findViewById(R.id.tvCarnetIntroducido);
    }

    public void volver(View v) {
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }
}