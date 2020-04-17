package com.MJMV.x00198319;

import java.util.ArrayList;

public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected ArrayList<Documento>;
    protected double Salario;

    public  Empleado(String nombre, String puesto, double salario){

    }

    public String getNombre() {
        return Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

<<<<<<< HEAD
    public ArrayList<Documento> getDocumento(){
        
=======
    public getDocumento() List<Documento>{

>>>>>>> fe2b23ddd19958cfabb9a7a4cd864c3014aec805
    }

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
