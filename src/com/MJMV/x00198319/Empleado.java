package com.MJMV.x00198319;

import java.util.List;
import java.lang.String;


public abstract class Empleado {
    protected String Nombre;
    protected String Puesto;
    protected List<Documento> documentos;
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

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documento x) {
        documentos.add(x);
    }
    public void removeDocumento(Documento d){

        documentos.removeIf(s -> {
            if(s instanceof Documento)
                return true;
            else
                return false;
        });
    }


    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
        }


}