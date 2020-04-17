package com.MJMV.x00198319;

import java.util.List;

public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected List<Documento>;
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
    public List<Documento> getDocumento(){

    }

    public List<Documento> getDocumento(){

=======
    public ArrayList<Documento> getDocumento(){
        

    public List<Documento> getDocumento() {


>>>>>>> b5080aae04bfb7110f31def73319c22c5ace0b89
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
