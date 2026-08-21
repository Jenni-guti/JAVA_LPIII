package Ejercicios;

import java.util.Scanner; // Importamos Scanner para poder ingresar datos

public class Arreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto para leer datos
        int[] numeros = new int[10]; // Creamos un arreglo de 10 posiciones
        System.out.println("Ingrese 10 numeros en orden creciente:");

        for (int i = 0; i < numeros.length; i++) { // Recorremos las 10 posiciones del arreglo
            if (i == 0) { // Si es la primera posicion, no necesitamos comparar
                System.out.print("Ingrese el numero 1: ");
                numeros[i] = sc.nextInt(); // Guardamos el primer numero

            } else {
                do { // Repetimos hasta que el numero sea mayor al anterior
                    System.out.print("Ingrese el numero " + (i + 1) + ": ");
                    numeros[i] = sc.nextInt(); // Guardamos el numero ingresado

                    if (numeros[i] <= numeros[i - 1]) { // Comprobamos si el numero es menor o igual al anterior
                        System.out.println("El numero debe ser mayor que " + numeros[i - 1]);
                    }

                } while (numeros[i] <= numeros[i - 1]); // Si no es mayor, volvemos a pedir el numero
            }
        }

        System.out.println("\nNumeros ingresados:");
        for (int i = 0; i < numeros.length; i++) { // Recorremos nuevamente el arreglo para mostrar sus valores
            System.out.print(numeros[i] + " "); // Mostramos cada numero
        }

        sc.close(); // Cerramos el Scanner
    }
}