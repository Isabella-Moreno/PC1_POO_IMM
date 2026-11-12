package Ejercicio1;

import java.util.Scanner;

public class EmpleadoPrueba {

    private Empleado empleado;
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Salario inicial: ");
        double salario = sc.nextDouble();

        empleado = new Empleado(nombre, salario);
        mostrarDatos();

        System.out.println("\n--- Probando acceso public vs getter/setter ---");
        // Acceso directo permitido porque 'nombre' es public
        empleado.nombre = empleado.nombre + " (Activo)";

        mostrarDatos();
    }

    private void mostrarDatos() {
        System.out.println("Empleado: " + empleado.nombre + " | Salario: $" + empleado.getSalario());
    }
}