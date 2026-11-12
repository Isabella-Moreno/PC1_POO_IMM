package Ejercicio3;

import java.util.Scanner;

public class UtilidadesPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\n--- RESULTADOS DE UTILIDADES ---");
        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(num1, num2));
        System.out.println("División: " + Utilidades.dividir(num1, num2));
    }
}