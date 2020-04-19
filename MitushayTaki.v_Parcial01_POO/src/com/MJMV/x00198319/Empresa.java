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

        empresa.planilla.forEach(b-> JOptionPane.showMessageDialog(null, b.toString()));
        String eliminarA = s;
        int pos=0, contador =0;

        for (int i=0; i<empresa.planilla.size(); i++){
            if (empresa.planilla.get(i).Nombre.equals(eliminarA)) {
                contador ++;
            }

        }
        if (contador>1){
            JOptionPane.showMessageDialog(null, "Se han detectado " + contador + " personas con" +
                    "el mismo nombre :O");
            String numeroDeDoc = JOptionPane.showInputDialog(null, "Numero de documento:");

            for (int i = 0; i<empresa.planilla.size(); i++) {
                for (int j=0; j<empresa.planilla.get(i).documentos.size();j++) {
                    if (empresa.planilla.get(i).Nombre.equals(eliminarA)) {
                        if (empresa.planilla.get(i).getDocumentos().get(j).getNumero().equals(numeroDeDoc)) {
                            empresa.planilla.remove(i);
                            JOptionPane.showMessageDialog(null, "Despedido");
                        }
                    }
                }
            }

        }
        else {

            for (int i = 0; i < empresa.planilla.size(); i++) {
                if (empresa.planilla.get(i).Nombre.equals(eliminarA)) {
                    pos = i;

                }
            }
            empresa.planilla.remove(pos);
            JOptionPane.showMessageDialog(null, "\n Despedido :c \n");
        }
    }

    @Override
    public String toString() {
        return "Empresa:" +
                "\nplanilla=" + planilla;
    }
}