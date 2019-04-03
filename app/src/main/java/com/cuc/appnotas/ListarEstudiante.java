package com.cuc.appnotas;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarEstudiante extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Estudiante> Students;
//    private ArrayList<Estudiante> StudentName = new ArrayList<Estudiante>();
    private ArrayList<String> Notes;
    private TextView txtNoResults;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_student);

        listView = (ListView) findViewById(R.id.Lv_Student);
//        StudentNote = Data.getEstudiantes();
        txtNoResults = (TextView)findViewById(R.id.txtNoResults);
        Students = Data.get();
        Notes = new ArrayList<String>();

        txtNoResults.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);

        if (Students.size() > 0) {
            listView.setVisibility(View.VISIBLE);
            txtNoResults.setVisibility(View.INVISIBLE);

            for (int i = 0; i < Students.size(); i++) {
                Notes.add(Students.get(i).getNombre()+ " " + Students.get(i).getApellidos()+ " - "+ "Grade:" +Students.get(i).getNotaFinal());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Notes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(ListarEstudiante.this, DetailEstudent.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

}
