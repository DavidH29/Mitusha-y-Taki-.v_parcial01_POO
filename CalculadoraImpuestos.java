package com.MJMV.x00198319;

public final class CalculadoraImpuestos {

    private double TotalRenta;
    private double TotalISS;
    private double TotalAFP;

    private CalculadoraImpuestos(){

    }

    public double calcularPago(Empleado x){
        double restante = 0.00;
        if(x instanceof PlazaFija){
            TotalAFP = 0.0625 * x.getSalario();
            TotalISS = 0.03 * x.getSalario();
            restante = x.getSalario() - TotalAFP - TotalISS;

            if(0.01 < x.getSalario() && x.getSalario() < 472.00)
                TotalRenta = 0;
            else if(472.01 < x.getSalario() && x.getSalario() < 895.24)
                TotalRenta = 0.1*(restante - 472) + 17.67;
            else if(895.25 < x.getSalario() && x.getSalario() < 2038.1)
                TotalRenta = 0.2*(restante - 895.24) + 60;
            else if(2038.11 < x.getSalario())
                TotalRenta = 0.3*(restante - 2038.1) + 288.57;
            return restante - TotalRenta;
        }
        else{
            TotalISS = 0;
            TotalAFP = 0;
            TotalRenta = 0.1*x.getSalario();
            return x.getSalario() - TotalRenta;
        }
    }

    public String mostrarTotales() {
        double DescuentoTotal = TotalAFP + TotalISS + TotalRenta;
        return "Total de renta: " + TotalRenta + "/n" + "Total ISSS: " + TotalISS + "/n" + "Total AFP: " + TotalAFP + "/n" + "Descuento total: " + DescuentoTotal;
    }
}