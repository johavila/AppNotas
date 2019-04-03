package com.cuc.appnotas;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateEstudiante extends AppCompatActivity {
    private EditText id, name, lastName, Nota1, Nota2, Nota3;
    private Resources resources;
    private ArrayList<Estudiante> Student;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_estudent);

        id = (EditText) findViewById(R.id.txt_id);
        name = (EditText) findViewById(R.id.txt_name);
        lastName = (EditText) findViewById(R.id.txt_lastname);
        Nota1 = (EditText)findViewById(R.id.Txt_Nota1);
        Nota2 = (EditText)findViewById(R.id.Txt_Nota2);
        Nota3 = (EditText)findViewById(R.id.Txt_Nota3);
        resources = this.getResources();
        Student = Data.get();
    }
    public void save(View view){
        String idV, nameV, lastNameV ;
        double Nota1V,Nota2V, Nota3V;
        idV = this.id.getText().toString();
        nameV = name.getText().toString();
        lastNameV = lastName.getText().toString();
        Nota1V = Double.parseDouble(Nota1.getText().toString());
        Nota2V = Double.parseDouble(Nota2.getText().toString());
        Nota3V = Double.parseDouble(Nota3.getText().toString());

        if (Nota1V <0.0 || Nota1V > 5.0){
            Toast.makeText(this, R.string.ErrorN1, Toast.LENGTH_LONG).show();
        }else if(Nota1V <0.0 || Nota1V > 5.0){
            Toast.makeText(this, R.string.ErrorN2, Toast.LENGTH_LONG).show();
        }else if (Nota1V <0.0 || Nota1V > 5.0){
            Toast.makeText(this, R.string.ErrorN3, Toast.LENGTH_LONG).show();
        }else {
            Estudiante E = new Estudiante(idV, nameV, lastNameV, Nota1V,Nota2V, Nota3V);
            E.saveStudent();
            Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();
        }


    }

}
