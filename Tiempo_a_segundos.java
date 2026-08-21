package Ejercicios;

import java.util.Scanner; // Importamos Scanner para ingresar datos

public class Tiempo_a_segundos {

    public static int convertirSegundos(int horas, int minutos, int segundos) { // Funcion que recibe horas, minutos y segundos

        int total; // Variable para guardar el resultado
        total = (horas * 3600) + (minutos * 60) + segundos; // Convertimos las horas y minutos a segundos
        return total; // Devolvemos el total de segundos
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos Scanner

        System.out.print("Ingrese las horas: ");
        int horas = sc.nextInt(); // Guardamos las horas

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt(); // Guardamos los minutos

        System.out.print("Ingrese los segundos: ");
        int segundos = sc.nextInt(); // Guardamos los segundos

        
        int total = convertirSegundos(horas, minutos, segundos);// Llamamos a la funcion y guardamos el resultado
        System.out.println("El tiempo en segundos es: " + total);// Mostramos el resultado

        sc.close(); // Cerramos Scanner
    }
}