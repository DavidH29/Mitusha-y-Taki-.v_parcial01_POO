package com.MJMV.x00198319;

import javax.swing.*;

public final class CalculadoraImpuestos {

    private static double TotalRenta;
    private static double TotalISS;
    private static double TotalAFP;

    private CalculadoraImpuestos(){

    }

    public static double calcularPago(Empresa empresa, String y) {
        double restante = 0.00;
        double liquido = 0.00;
        Empleado x = null;
        for (int i = 0; i < empresa.getPlanilla().size(); i++) {
            if (empresa.getPlanilla().get(i).Nombre.equals(y)) {
                x = empresa.getPlanilla().get(i);

                if (x instanceof PlazaFija) {
                    TotalAFP = 0.0625 * x.getSalario();
                    TotalISS = 0.03 * x.getSalario();
                    restante = x.getSalario() - TotalAFP - TotalISS;

                    if (0.01 < x.getSalario() && x.getSalario() < 472.00)
                        TotalRenta = 0;
                    else if (472.01 < x.getSalario() && x.getSalario() < 895.24)
                        TotalRenta = 0.1 * (restante - 472) + 17.67;
                    else if (895.25 < x.getSalario() && x.getSalario() < 2038.1)
                        TotalRenta = 0.2 * (restante - 895.24) + 60;
                    else if (2038.11 < x.getSalario())
                        TotalRenta = 0.3 * (restante - 2038.1) + 288.57;
                    liquido = restante - TotalRenta;
                    JOptionPane.showMessageDialog(null, "Empleado: " + x.Nombre + "\n"
                            + "Puesto: " + x.Puesto + "\n" + "Pago mensual: " + liquido);
                }
                else {
                    TotalISS = 0;
                    TotalAFP = 0;
                    TotalRenta = 0.1 * x.getSalario();
                    liquido = x.getSalario() - TotalRenta;
                    JOptionPane.showMessageDialog(null, "Servicio: " + x.Nombre + "\n"
                            + "Funcion: " + x.Puesto + "\n" + "Pago mensual: " + liquido);
                }
            }
        }
        return 0;
    }

    public static String mostrarTotales (Empresa empresa, String y) {
        Empleado x = null;
        double DescuentoTotal = 0;
        for (int i = 0; i < empresa.getPlanilla().size(); i++) {
            if (empresa.getPlanilla().get(i).Nombre.equals(y)) {
                x = empresa.getPlanilla().get(i);

                double restante = 0.00;
                if (x instanceof PlazaFija) {
                    TotalAFP = 0.0625 * x.getSalario();
                    TotalISS = 0.03 * x.getSalario();
                    restante = x.getSalario() - TotalAFP - TotalISS;

                    if (0.01 < x.getSalario() && x.getSalario() < 472.00)
                        TotalRenta = 0;
                    else if (472.01 < x.getSalario() && x.getSalario() < 895.24)
                        TotalRenta = 0.1 * (restante - 472) + 17.67;
                    else if (895.25 < x.getSalario() && x.getSalario() < 2038.1)
                        TotalRenta = 0.2 * (restante - 895.24) + 60;
                    else if (2038.11 < x.getSalario())
                        TotalRenta = 0.3 * (restante - 2038.1) + 288.57;
                }
                else {
                    TotalISS = 0;
                    TotalAFP = 0;
                    TotalRenta = 0.1 * x.getSalario();
                }
                DescuentoTotal = TotalAFP + TotalISS + TotalRenta;
                JOptionPane.showMessageDialog(null, "Empleado: " + y + "\n" + "Puesto: "
                        + x.Puesto+ "\n"
                        + "Total de renta: " + TotalRenta + "\n" + "Total ISSS: "
                        + TotalISS + "\n" + "Total AFP: " + TotalAFP +
                        "\n" + "Descuento total: " + DescuentoTotal);
            }
        }
       return "Descuentos Mostrados";
    }
}