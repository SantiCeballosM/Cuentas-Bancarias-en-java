package Bancos;

import java.util.ArrayList;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public double consultarSaldo() {
        return saldo;
    }
}

