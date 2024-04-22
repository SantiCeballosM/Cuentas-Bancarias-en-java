package Bancos;
import java.util.ArrayList;
import java.util.List;

public class GestorCuenta {
    private List<CuentaBancaria> cuentas;

    public GestorCuenta() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {

        cuentas.add(cuenta);
    }

    public void depositar(int indiceCuenta, double cantidad) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            cuentas.get(indiceCuenta).depositar(cantidad);
        } else {
            System.out.println("Ocurrio algo mal");
        }
    }

    public void retirar(int indiceCuenta, double cantidad) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            cuentas.get(indiceCuenta).retirar(cantidad);
        } else {
            System.out.println("Ups revisa, algo paso mal");
        }
    }

    public double consultarSaldo(int indiceCuenta) {
        if (indiceCuenta >= 0 && indiceCuenta < cuentas.size()) {
            return cuentas.get(indiceCuenta).consultarSaldo();
        } else {
            System.out.println("indice equivocado");
            return -1;
        }
    }
}
