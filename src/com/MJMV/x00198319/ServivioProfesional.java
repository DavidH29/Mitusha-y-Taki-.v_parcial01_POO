package com.MJMV.x00198319;

public class ServivioProfesional extends Empleado {
    private int mesesContrato;

    public ServivioProfesional(String nombre,String numero, double salario, int mesesContrato){
        super(nombre, numero, salario);
        this.mesesContrato= mesesContrato;


    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

}
