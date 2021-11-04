    package org.iesfm.formularioconpantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected static final String FORMULARIO_CON_PANTALLAS_NAME = "org.iesfm.formularioconpantallas.name";
    protected static final String FORMULARIO_CON_PANTALLAS_SURNAME = "org.iesfm.formularioconpantallas.surname";
    protected static final String FORMULARIO_CON_PANTALLAS_AGE = "org.iesfm.formularioconpantallas.age";
    protected static final String FORMULARIO_CON_PANTALLAS_CARNET = "org.iesfm.formularioconpantallas.carnet";

    private EditText etName;
    private EditText etSurname;
    private EditText etAge;
    private CheckBox cbCarnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etNombre);
        etSurname = (EditText) findViewById(R.id.etApellidos);
        etAge = (EditText) findViewById(R.id.etEdead);
        cbCarnet = (CheckBox) findViewById(R.id.cbCarnet);

        cbCarnet.setChecked(false);
    }

    public void enviarInformacion(View v) {

        Intent pantallaSecundaria = new Intent(this, MainActivity2.class);

        String name = etName.getText().toString();
        String surname = etSurname.getText().toString();
        String age = etAge.getText().toString();
        String carnet;

        if (cbCarnet.isChecked()) {
            carnet = "Si tengo carnet";
        } else {
            carnet = "No tengo carnet";
        }

        pantallaSecundaria.putExtra(FORMULARIO_CON_PANTALLAS_NAME, name);
        pantallaSecundaria.putExtra(FORMULARIO_CON_PANTALLAS_SURNAME, surname);
        pantallaSecundaria.putExtra(FORMULARIO_CON_PANTALLAS_AGE, age);
        pantallaSecundaria.putExtra(FORMULARIO_CON_PANTALLAS_CARNET, carnet);


        startActivity(pantallaSecundaria);
    }
}