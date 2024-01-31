package web;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio2Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        String numero1 = scanner.nextLine();
        System.out.println("Ingresa otro numero");
        String numero2 = scanner.nextLine();

        int number1 = Integer.parseInt(numero1);
        int number2 = Integer.parseInt(numero2);

        if(number1 > number2){
            System.out.println("El primer numero con valor de " + number1 + " es mayor que " + number2);
        } else if (number2 > number1) {
            System.out.println("El segundo numero con valor de " + number2 + " es mayor que " + number1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
