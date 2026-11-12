package Ejercicio2;

import java.util.Scanner;

public class CuentaPrueba {

    private CuentaBancaria cuenta;
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Número de cuenta: ");
        String num = sc.nextLine();

        System.out.print("Tipo de cuenta (Ahorros / Corriente): ");
        String tipo = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        cuenta = new CuentaBancaria(num, saldo, tipo);
        cuenta.mostrarDetalles();

        // Acceso directo permitido porque 'tipoCuenta' es public
        cuenta.tipoCuenta = "Corriente Empresarial";

        // Acceso controlado mediante setter público para 'saldo'
        cuenta.setSaldo(cuenta.getSaldo() + 500);

        // --- ERROR DE COMPILACIÓN (DESCOMENTAR PARA OBSERVAR EN INTELLIJ) ---
        // Error: 'numeroCuenta' has private access in 'Ejercicio2.CuentaBancaria'
        // System.out.println(cuenta.numeroCuenta);
        // cuenta.numeroCuenta = "000000";

        System.out.println("\n--- DATOS ACTUALIZADOS ---");
        cuenta.mostrarDetalles();
    }
}