package com.cuc.appnotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailEstudent extends AppCompatActivity {
    private Intent In;
    private ArrayList<Estudiante> Students;
    private TextView Id, Name, LastName, Nota1, Nota2, Nota3, NotaFinal;
    private int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_detail);
        In = getIntent();
        Students = Data.get();

        int cont = In.getIntExtra("position", 0);
        Id = (TextView) findViewById(R.id.lbl_id);
        Name = (TextView)findViewById(R.id.Lbl_Name);
        LastName = (TextView)findViewById(R.id.Lbl_Lastname);
        Nota1 = (TextView)findViewById(R.id.Lbl_Note1);
        Nota2=(TextView)findViewById(R.id.Lbl_Note2);
        Nota3=(TextView)findViewById(R.id.Lbl_Note3);

        loadData(Students.get(cont));
    }

    private void loadData(Estudiante Student) {
        Id.setText(Student.getId());
        Name.setText(Student.getNombre());
        LastName.setText(Student.getApellidos());
        Nota1.setText(String.valueOf(Student.getNota1()));
        Nota2.setText(String.valueOf(Student.getNota2()));
        Nota3.setText(String.valueOf(Student.getNota3()));
        NotaFinal.setText(String.valueOf(Student.getNotaFinal()));
    }


}
