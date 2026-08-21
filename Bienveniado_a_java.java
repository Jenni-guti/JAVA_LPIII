package Ejercicios;

import java.util.Scanner; // Importamos Scanner para ingresar el nombre

public class Bienveniado_a_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos Scanner
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine(); // Guardamos el nombre ingresado
        System.out.println("Bienvenido a Java, " + nombre);// Mostramos el saludo junto con el nombre

        sc.close(); // Cerramos Scanner
    }
}