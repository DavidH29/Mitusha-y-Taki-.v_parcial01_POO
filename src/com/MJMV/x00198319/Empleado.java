package com.MJMV.x00198319;

import java.util.List;

public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected List<Documento>;
    protected double Salario;

    public Empleado(String nombre, String puesto, double salario) {
        Nombre = nombre;
        Puesto = puesto;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public List<Documento> getDocumento(){
<<<<<<< HEAD
        return Documento;

    }
=======

    }
    
>>>>>>> a7b4ef99c768a7965b187b7540d101870e9d7a6b

    public void addDocumento(Documento){

    }

    public void removeDocumento(String){

    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}