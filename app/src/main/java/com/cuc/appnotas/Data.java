package com.cuc.appnotas;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Data extends AppCompatActivity {

    private static ArrayList<Estudiante> Estudiantes = new ArrayList<>();

    public static void save(Estudiante E) {
        Estudiantes.add(E);
    }

    public static ArrayList<Estudiante> get() {
        return Estudiantes;
    }

    public static void delete(Estudiante E) {}

    public static ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public static void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        Estudiantes = estudiantes;
    }
}
