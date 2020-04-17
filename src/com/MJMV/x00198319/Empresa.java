package com.MJMV.x00198319;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado x){
        

    }

    public void quitEmpleado(String s){

    }
}