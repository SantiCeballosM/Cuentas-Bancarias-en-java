package Bancos;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bancos.GestorCuenta gestor = new Bancos.GestorCuenta();
        System.out.println("Ingresa el monto inicial de la cuenta corriente: ");
        int saldoCorriente = scanner.nextInt();
        System.out.println("Ingresa el monto inicial de la cuenta de ahorros: ");
        int saldoAhorro = scanner.nextInt();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoCorriente, 500);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoAhorro, 0.05);
        gestor.agregarCuenta(cuentaCorriente);
        gestor.agregarCuenta(cuentaAhorro);
        int opci;
        do{
            System.out.println("             MENU DE OPCIONES");
            System.out.println("Elegir cuenta de banco");
            System.out.println("1- Cuenta Corriente");
            System.out.println("2- Cuenta de Ahorro");
            System.out.println("3- Salir");

            opci = scanner.nextInt();
            switch (opci){
                case 1:

                    System.out.println("Bienvenido al menu de Cuenta Corriente");
                    System.out.println("Seleccione la opcion que quiere realizar:");
                    System.out.println("1- Depositar");
                    System.out.println("2- Retirar");
                    System.out.println("3- Consultar saldo");
                    System.out.println();
                    System.out.println("Ingresa la opcion que deseas: ");
                    int opcionCorriente = scanner.nextInt();
                    switch (opcionCorriente) {
                        case 1:
                            System.out.println("Ingrese el monto a depositar:");
                            int montoDeposito1 = scanner.nextInt();
                            gestor.depositar(0, montoDeposito1);
                            break;
                        case 2:
                            System.out.println("Ingrese el monto a retirar:");
                            double montoRetiro1 = scanner.nextInt();
                            gestor.retirar(0, montoRetiro1);
                            break;
                        case 3:
                            int saldoCuentaCorriente = (int) gestor.consultarSaldo(0);
                            System.out.println("Saldo de cuenta corriente: " + saldoCuentaCorriente);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                    break;
                case 2:

                    System.out.println("Bienvenido al menu de Cuenta Corriente");
                    System.out.println("Seleccione la opcion que quiere realizar:");
                    System.out.println("1- Depositar");
                    System.out.println("2- Retirar");
                    System.out.println("3- Consultar saldo");
                    System.out.println();
                    System.out.println("Ingresa la opcion que deseas: ");
                    int opcionAhorro = scanner.nextInt();
                    switch (opcionAhorro) {
                        case 1:
                            System.out.println("Ingrese el monto a depositar:");
                            int montoDeposito = scanner.nextInt();
                            gestor.depositar(1, montoDeposito);
                            break;
                        case 2:
                            System.out.println("Ingrese el monto a retirar:");
                            int montoRetiro = scanner.nextInt();
                            gestor.retirar(1, montoRetiro);
                            break;
                        case 3:
                            double saldoCuentaAhorro = gestor.consultarSaldo(1);
                            System.out.println("Saldo de cuenta de ahorro: " + saldoCuentaAhorro);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                    break;
                case 3:
                    System.out.println("Saliste del sistema");
                    break;
                default:
                    System.out.println("Ups lo sentimos ingresaste una opcion invalida");

            }
        }while(opci!=3);




    }
}
