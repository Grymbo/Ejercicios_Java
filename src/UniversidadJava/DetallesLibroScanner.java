package UniversidadJava;

import javax.swing.*;
import java.util.Scanner;

public class DetallesLibroScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el Titulo: ");
        String tituloLibro = scanner.nextLine();

        System.out.println("Proporciona el Autor: ");
        String autorLibro = scanner.nextLine();

        String libro = "La novela titulada " + tituloLibro + " fue escrito por el autor " + autorLibro;
        System.out.println(libro);

    }
}
