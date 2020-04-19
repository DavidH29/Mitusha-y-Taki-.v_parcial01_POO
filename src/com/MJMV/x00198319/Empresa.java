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

    public void quitEmpleado(Empresa empresa, String s){
        JOptionPane.showMessageDialog(null, "\n......... Eliminando Empleado  ..........");

       empresa.planilla.forEach(b-> System.out.println(b.toString()));
        String eliminarA = s;
        int pos=0;

        for (int i =0; i < empresa.planilla.size(); i++){
            if (empresa.planilla.get(i).Nombre.equals(eliminarA)){
                pos = i;
            }

        }
        empresa.planilla.remove(pos);
        JOptionPane.showMessageDialog(null, "\n Despedido :c \n");
    }

    @Override
    public String toString() {
        return "Empresa:" +
                "\nplanilla=" + planilla;
    }
}