package MasterJava;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura");
        String factura = scanner.nextLine();

        System.out.println("Ingresa el primer monto");
        String number1 = scanner.nextLine();
        Double numero1 = Double.parseDouble(number1);


        System.out.println("Ingresa el segundo monto");
        String number2 = scanner.nextLine();
        Double numero2 = Double.parseDouble(number2);

        Double suma = numero1 + numero2;
        Double impuesto = suma * (0.19);

        String mensaje = "La factura " + factura + " de oficina, tiene un total bruto de " + suma + ", con un impuesto de " + impuesto + " y el monto desoues del impuesto es de " + (suma + impuesto);

        System.out.println(mensaje);

    }
}
