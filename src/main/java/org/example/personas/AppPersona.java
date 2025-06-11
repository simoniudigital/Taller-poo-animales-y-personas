package org.example.personas;

import java.util.*;
import java.util.stream.*;

public class AppPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        String opcion = "s";
        while (opcion.equalsIgnoreCase("s")) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Género (M/F): ");
            String genero = scanner.nextLine();

            System.out.print("Sueldo por hora: ");
            double sueldoHora = Double.parseDouble(scanner.nextLine());

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            Persona persona = new Persona(nombre, apellido, edad, genero.toUpperCase(), sueldoHora, cargo);
            personas.add(persona);

            System.out.print("¿Desea ingresar otra persona? (s/n): ");
            opcion = scanner.nextLine();
        }

        // a. Cantidad de personas
        System.out.println("\nCantidad de personas: " + personas.size());

        // b. Promedio de edad
        double promedioEdad = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("Promedio de edades: " + promedioEdad);

        // c. Cantidad de mayores de edad
        long mayoresEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
        System.out.println("Cantidad de mayores de edad: " + mayoresEdad);

        // d. Nombres que empiezan con A
        System.out.println("Personas cuyos nombres empiezan con 'A':");
        personas.stream()
                .filter(p -> p.getNombre().startsWith("A"))
                .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

        // e. Apellidos que contienen 'M'
        System.out.println("Personas cuyos apellidos contienen 'M':");
        personas.stream()
                .filter(p -> p.getApellido().toUpperCase().contains("M"))
                .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

        // Ejercicio 3

        // a. Sueldo de 8 horas para directores masculinos
        System.out.println("\nSueldo de 8 horas para directores masculinos:");
        personas.stream()
            .filter(p -> p.getCargo().equalsIgnoreCase("director") && p.getGenero().equalsIgnoreCase("M"))
            .peek(p -> System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido()))
            .map(p -> p.getSueldoHora() * 8)
            .forEach(sueldo -> System.out.println("Sueldo por 8 horas: $" + sueldo));

        // b. Primera mujer desarrolladora
        System.out.println("\nPrimera mujer desarrolladora:");
        personas.stream()
            .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador") && p.getGenero().equalsIgnoreCase("F"))
            .findFirst()
            .ifPresent(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

        // c. Desarrollador que más gana por hora
        System.out.println("\nDesarrollador que más gana por hora:");
        Optional<Persona> masGana = personas.stream()
            .filter(p -> p.getCargo().equalsIgnoreCase("desarrollador"))
            .max(Comparator.comparingDouble(Persona::getSueldoHora));

        if (masGana.isPresent()) {
            Persona p = masGana.get();
            System.out.println("Nombre: " + p.getNombre() + " " + p.getApellido());
            System.out.println("Sueldo/hora: $" + p.getSueldoHora());
        }

        // d. Mujeres ordenadas por nombre
        System.out.println("\nMujeres ordenadas por nombre:");
        personas.stream()
            .filter(p -> p.getGenero().equalsIgnoreCase("F"))
            .sorted(Comparator.comparing(Persona::getNombre))
            .forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));
    }
}
