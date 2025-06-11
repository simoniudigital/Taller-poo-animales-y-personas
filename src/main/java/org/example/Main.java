package org.example;

import org.example.animales.AppAnimales;
import org.example.personas.AppPersona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n==== Hola querido profesor ====");
            System.out.println("1. Clasificación de Animales");
            System.out.println("2. Gestión de Personas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    AppAnimales.main(null); // Ejecuta AppAnimales
                    break;
                case "2":
                    AppPersona.main(null); // Ejecuta AppPersona
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (!opcion.equals("3"));
    }
}
