package com.MJMV.x00198319;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList <Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado x){
        planilla.add(x);
    }

    public void quitEmpleado(String s){

        for(int i = 0; i < planilla.size(); i++){
            if(planilla.get(i).Nombre == s){
                planilla.remove(i);
                JOptionPane.showMessageDialog(null, "Empleado despedido");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Empleado inexistente");
    }

    @Override
    public String toString() {
        return "Empresa:" +
                "\nplanilla=" + planilla;
    }
}