package Bancos;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    public void aplicarInteres() {
        saldo *= (1 + tasaInteres);
    }
}
