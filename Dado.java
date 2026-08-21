package Ejercicios;

import java.util.Random; // Importamos Random para generar numeros aleatorios

public class Dado {
    public static void main(String[] args) {

        Random random = new Random(); // Creamos un objeto para generar numeros aleatorios
        int[] frecuencia = new int[6]; // Arreglo para guardar la frecuencia de cada cara

        for (int i = 0; i < 20000; i++) { // Repetimos el lanzamiento del dado 20000 veces
            int cara = random.nextInt(6) + 1; // Generamos un numero aleatorio entre 1 y 6
            frecuencia[cara - 1]++; // Aumentamos en 1 la frecuencia de la cara obtenida
        }

        System.out.println("Frecuencia de cada cara:");
        for (int i = 0; i < frecuencia.length; i++) { // Recorremos el arreglo para mostrar las frecuencias

            System.out.println("Cara " + (i + 1) + ": " + frecuencia[i] + " veces");
        }
    }
}