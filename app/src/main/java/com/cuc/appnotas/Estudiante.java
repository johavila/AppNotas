package com.cuc.appnotas;

import android.support.v7.app.AppCompatActivity;

public class Estudiante extends AppCompatActivity {

    private String Id;
    private String Nombre;
    private String Apellidos;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double NotaFinal;

    public Estudiante(String id, String nombre, String apellidos, double nota1, double nota2, double nota3) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        Nota3 = nota3;
    }

    public double getNotaFinal()  {
        return NotaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        NotaFinal = notaFinal;
    }

    public void CalcularNotaFinal() {
       NotaFinal = (Nota1+Nota2+Nota3)/3;
    }

    public void saveStudent(){
        Data.save(this);
    }
}
