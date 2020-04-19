package com.MJMV.x00198319;

import javax.swing.*;

public class Main {
    static Empresa empresa = new Empresa("MJ&D");

    public static void main(String[] args) {
        boolean seguir = true;
        do {
            int Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, Menu()));
            switch (Opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa, vuelva " +
                            "pronto :D");
                    seguir = false;
                    break;
                case 1: //Contratando
                     Agregar();
                    break;
                case 2: // Despidiendo
                    Despedir();
                    break;
                case 3: // Mostrando Lista de Empleados
                    Mostrar();
                    break;
                case 4: // Mostrando sueldo liquido
                    JOptionPane.showMessageDialog(null, "Sueldo: " + Sueldo());
                    break;
                case 5: // Mostrando descuentos
                    Total();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion ivalida >:v");
                    break;
            }
        }
        while (seguir) ;

    }
    static String Menu () {
        return "Menu opciones\n\t1) Agregar Empleado\n\t2) Despedir Empleado\n\t3) Ver lista de Empleados" +
                "\n\t4) Calcular sueldo\n\t5) Mostrar Total\n\t0) Salir\n\nSu Opción: ";

    }

    static void Agregar (){
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
            empresa.addEmpleado(x);
        }
        else if (plaza.equalsIgnoreCase("Servicio profesional")|| plaza.equalsIgnoreCase(
                "Servicio")){
            String nombre1 = JOptionPane.showInputDialog(null, "Nombre del servicio: ");
            String puesto1 = JOptionPane.showInputDialog(null, "Funcion que desempeña: ");
            double salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario " +
                    "$"));
            int contrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Meses " +
                    "de contrato: "));
            String NombreDocumento1 = JOptionPane.showInputDialog(null, "Documento: ");
            String NumeroDocumento1 = JOptionPane.showInputDialog(null, "No. de documento: ");
            ServicioProfesional x = new ServicioProfesional(nombre1, puesto1, salario1, contrato);
            Documento doc1 = new Documento(NombreDocumento1, NumeroDocumento1);
            x.addDocumento(doc1);
            empresa.addEmpleado(x);
        }
    }

    static void Despedir () {
        String NombreDespedir = JOptionPane.showInputDialog(null, "Empleado o " +
                "servicio a despedir: ");
        empresa.quitEmpleado(empresa, NombreDespedir);
    }

    static void Mostrar(){
        empresa.getPlanilla().forEach(b-> JOptionPane.showMessageDialog(null,
                b.toString()));
    }

    static double Sueldo(){
        String NombreEmpleado = JOptionPane.showInputDialog(null, "Nombre del empleado: ");
        return CalculadoraImpuestos.calcularPago(empresa, NombreEmpleado);
    }

    static String Total(){
        String NombreEmpleado = JOptionPane.showInputDialog(null, "Nombre del empleado: ");
        return CalculadoraImpuestos.mostrarTotales(empresa, NombreEmpleado);
    }
}

