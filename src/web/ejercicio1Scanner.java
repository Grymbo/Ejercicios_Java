package web;

import java.util.Scanner;

public class ejercicio1Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numberEjercicio1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero");
        int numberEjercicio2 = scanner.nextInt();

        System.out.println("La suma de los números dados es: " + (numberEjercicio1 + numberEjercicio2));
        System.out.println("La resta de los números dados es: " + (numberEjercicio1 - numberEjercicio2));
        System.out.println("La multiplicación de los números dados es: " + (numberEjercicio1 * numberEjercicio2));
        System.out.println("La suma de los division dados es: " + (numberEjercicio1 / numberEjercicio2));
    }
}
