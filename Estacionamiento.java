package Ejercicios;

public class Estacionamiento {

    public static double calcularCargo(int horas) { // Funcion que recibe las horas y devuelve el cargo
        double cargo; // Variable donde guardaremos el costo
        if (horas <= 0) {
            cargo = 0; // Si no hay horas, el cargo es 0

        } else if (horas == 1) {
            cargo = 3.00; // La primera hora cuesta S/3.00

        } else {
            cargo = 3.00 + (horas - 1) * 0.50; // Primera hora cuesta 3 soles, las horas adicionales cuestan 0.50 cada una
        }

        if (cargo > 12.00) { // Si el cargo supera los S/12, cobramos solamente S/12
            cargo = 12.00;
        }

        return cargo; // Devolvemos el cargo que fue calculado
    }

    public static void main(String[] args) {
        int horas = 7; // Cantidad de horas ingresadas
        double cargo = calcularCargo(horas); // Llamamos a la funcion
        System.out.println("Horas: " + horas); // Mostramos las horas
        System.out.println("El cargo es: S/" + cargo); // Mostramos el cargo
    }
}