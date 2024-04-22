package Bancos;
public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo + limiteSobregiro) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar por que no hay suficiente plata en la cuenta");
        }
    }
}
