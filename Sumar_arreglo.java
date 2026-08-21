package Ejercicios;

public class Sumar_arreglo {

    public static int sumarArreglo(int[] arreglo) { // Funcion que recibe el arreglo como parametro
        int suma = 0; // Inicializamos la suma
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i]; // Sumamos cada elemento
        }

        return suma; // Devolvemos la suma
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Creamos el arreglo
        int rpta = sumarArreglo(numeros); // Enviamos el arreglo a la funcion
        System.out.println("La suma es: " + rpta);
    }
}