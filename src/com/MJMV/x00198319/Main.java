package com.JDHA.x00156919;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        boolean seguir = true;
        Empresa y = new Empresa("kjsksjksjks");
        do {
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, Menu()));
            switch (Opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa, vuelva " +
                            "pronto :D");
                    seguir = false;
                case 1: //Contratando
                    String plaza = JOptionPane.showInputDialog(null, "Tipo de plaza: ");
                    if(plaza.equalsIgnoreCase("Plaza fija")|| plaza.equalsIgnoreCase("Fija")){
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
                    else if (plaza.equalsIgnoreCase("Servicio profesional")|| plaza.equalsIgnoreCase("Servicio")){
                        String nombre1 = JOptionPane.showInputDialog(null, "Nombre del servicio: ");
                        String puesto1 = JOptionPane.showInputDialog(null, "Funcion que desempeña: ");
                        double salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario $"));
                        int contrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses de contrato: "));
                        String NombreDocumento1 = JOptionPane.showInputDialog(null, "Documento: ");
                        String NumeroDocumento1 = JOptionPane.showInputDialog(null, "No. de documento: ");
                        ServicioProfesional x = new ServicioProfesional(nombre1, puesto1, salario1, contrato);
                        Documento doc1 = new Documento(NombreDocumento1, NumeroDocumento1);
                        x.addDocumento(doc1);
                        y.addEmpleado(x);
                    }

                        break;
                        case 2: // Despidiendo
                            
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida >:v");
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

