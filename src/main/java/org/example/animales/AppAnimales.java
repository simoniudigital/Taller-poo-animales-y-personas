package org.example.animales;

import java.util.*;

public class AppAnimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Animal>> clasificacion = new HashMap<>();
        List<Animal> animales = new ArrayList<>();

        String opcion = "s";
        while (opcion.equalsIgnoreCase("s")) {
            System.out.print("Ingrese nombre del animal: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese tipo (terrestre, aéreo, acuático): ");
            String tipo = scanner.nextLine();

            System.out.print("Ingrese género (masculino, femenino): ");
            String genero = scanner.nextLine();

            Animal animal = new Animal(nombre, tipo.toLowerCase(), genero);
            animales.add(animal);

            clasificacion.computeIfAbsent(tipo.toLowerCase(), k -> new ArrayList<>()).add(animal);

            System.out.print("¿Desea ingresar otro animal? (s/n): ");
            opcion = scanner.nextLine();
        }

        System.out.println("\nClasificación de Animales:");
        clasificacion.forEach((categoria, listaAnimales) -> {
            System.out.println(categoria.substring(0,1).toUpperCase() + categoria.substring(1) + ":");
            listaAnimales.forEach(a -> System.out.println("  " + a.getNombre()));
        });
    }
}
