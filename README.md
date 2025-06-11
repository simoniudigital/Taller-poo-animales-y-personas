# Taller POO - Genéricos, Lambda y Streams

## Objetivo

Aplicar y reforzar de forma práctica los conceptos de:

- Genéricos
- Lambdas
- Streams

---

## Estructura del Proyecto
src/main/java/org/example/
Main.java (menú principal)

src/main/java/org/example/animales/
Animal.java
AppAnimales.java

src/main/java/org/example/personas/
Persona.java
AppPersona.java


---

## Ejercicios implementados

### 1️⃣ Clasificación de Animales

Se implementa la clase `Animal` y la aplicación `AppAnimales.java`, que permite:

- Ingresar animales por consola.
- Clasificarlos como **terrestres**, **aéreos** o **acuáticos**.
- Mostrar la clasificación final por consola.

---

### 2️⃣ y 3️⃣ Gestión de Personas con Lambdas y Streams

Se implementa la clase `Persona` y la aplicación `AppPersona.java`, que permite:

- Ingresar personas por consola.
- Aplicar operaciones usando **Streams** y **Lambdas**:
  - Cantidad total de personas.
  - Promedio de edades.
  - Cantidad de mayores de edad.
  - Nombres que comienzan con "A".
  - Apellidos que contienen la letra "M".
  - Cálculo de sueldo de 8 horas para directores masculinos.
  - Mostrar la primera mujer desarrolladora.
  - Mostrar al desarrollador que más gana por hora.
  - Mostrar las mujeres ordenadas por nombre.

---

## Cómo ejecutar el proyecto

### Opción 1️⃣ - Desde el menú general

Puedes ejecutar la clase `Main.java`, que contiene un **menú interactivo** que te permite:

1️⃣ Ejecutar el ejercicio de **Animales**  
2️⃣ Ejecutar el ejercicio de **Personas**  
3️⃣ Salir del programa

**Pasos:**

1. Abre el proyecto en tu IDE (IntelliJ IDEA recomendado, o Eclipse).
2. Ejecuta la clase `org.example.Main`.
3. Usa el menú que aparecerá en consola para elegir la parte que quieras probar.

---

### Opción 2️⃣ - Ejecutar cada app individual

Si prefieres, puedes ejecutar directamente:

- `org.example.animales.AppAnimales` → para la parte de **clasificación de animales**.
- `org.example.personas.AppPersona` → para la parte de **gestión de personas**.

---

## Requisitos

- Java 17 o superior (puede funcionar también en Java 11+).
- Maven (opcional, pero el `pom.xml` ya está configurado).

---

## Notas

- El código está estructurado en paquetes separados para **animales** y **personas**, siguiendo buenas prácticas de organización de código.
- Se utilizan correctamente **Streams**, **Lambdas** y **Optional** para los ejercicios solicitados.
- El código es modular y permite fácilmente su ampliación o mejora.

---

## Autor

Simón Castaño  
Taller POO - Universidad  
Junio 2025

---


