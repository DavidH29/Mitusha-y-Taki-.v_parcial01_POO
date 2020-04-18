package com.MJMV.x00198319;

import javax.swing.*;

public class Main {
    static Empresa y = new Empresa("Hola");

    public static void main(String[] args) {
        boolean seguir = true;
        do {
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, Menu()));
            switch (Opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa, vuelva " +
                            "pronto :D");
                    seguir = false;
                case 1:
                    String plaza = JOptionPane.showInputDialog(null, "Tipo de plaza: ");

                    if (plaza.equalsIgnoreCase("Plaza fija")) {
                        String nombre = JOptionPane.showInputDialog(null, "Nombre del empleado: ");
                        String puesto = JOptionPane.showInputDialog(null, "Puesto que desempeña: ");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario $"));
                        String NombreDocumento = JOptionPane.showInputDialog(null, "Documento: ");
                        String NumeroDocumento = JOptionPane.showInputDialog(null, "No. de documento: ");
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de " +
                                "extensión: "));
                        PlazaFija x = new PlazaFija(nombre, puesto, salario, extension);
                        Documento doc = new Documento(NombreDocumento, NumeroDocumento);
                        x.addDocumento(doc);
                        y.addEmpleado(x);

                    }

                        break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
            }
            while (seguir) ;

        }
        static String Menu () {
            return "Menu opciones\n\t1) Agregar Empleado\n\t2) Despedir Empleado\n\t3) Ver lista de Empleados" +
                    "\n\t4) Calcular sueldo\n\t5) Mostrar Total\n\t0) Salir\n\nSu Opción: ";

        }


    }

