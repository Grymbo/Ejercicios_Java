package web;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog(null,"Ingresa un numero");
        String numero2 = JOptionPane.showInputDialog(null, "Ingresa otro numero");

        int number1 = Integer.parseInt(numero1);
        int number2 = Integer.parseInt(numero2);

        if(number1 > number2){
            JOptionPane.showMessageDialog(null, "El primer numero con valor de " + number1 + " es mayor que " + number2);
            System.out.println("El primer numero con valor de " + number1 + " es mayor que " + number2);
        } else if (number2 > number1) {
            JOptionPane.showMessageDialog(null, "El segundo numero con valor de " + number2 + " es mayor que " + number1);
            System.out.println("El segundo numero con valor de " + number2 + " es mayor que " + number1);
        } else {
            JOptionPane.showMessageDialog(null, "Los dos numeros son iguales");
            System.out.println("Los dos numeros son iguales");
        }
    }
}
