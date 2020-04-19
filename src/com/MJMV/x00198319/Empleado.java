package com.MJMV.x00198319;

import java.util.ArrayList;
import java.lang.String;


public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected ArrayList<Documento> documentos;
    protected double Salario;

    public Empleado(String nombre, String puesto, double salario) {
        Nombre = nombre;
        Puesto = puesto;
        Salario = salario;
        documentos = new ArrayList<>();

    }

    public String getNombre() {
        return Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documento x) {
        documentos.add(x);
    }
    public void removeDocumento(Documento d){
        for(int i = 0; i < documentos.size(); i ++){
            if(documentos.get(i).getNumero() == d.getNumero())
                documentos.remove(i);
            return;
        }
    }


    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + Nombre + '\'' +
                "\nPuesto: " + Puesto + '\'' +
                "\nDocumentos:" + documentos +
                "\nSalario: " + Salario ;
    }
}