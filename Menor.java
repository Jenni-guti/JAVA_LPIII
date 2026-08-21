package Ejercicios;

public class Menor {

    public static double num_menor(double a, double b, double c) { // Funcion que recibe 3 numeros decimales y devuelve el menor
        double menor = a; // Suponemos que el primer numero es el menor
        if (b < menor) { // Verificamos si b es menor
            menor = b;
        }

        if (c < menor) { // Verificamos si c es menor
            menor = c;
        }

        return menor; // Retornamos el menor numero
    }

    public static void main(String[] args) {
        double rpta = num_menor(10.5, 3.2, 9.4);
        System.out.println("El menor numero es: " + rpta);
    }
}