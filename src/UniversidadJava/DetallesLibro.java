package UniversidadJava;

import javax.swing.*;

public class DetallesLibro {
    public static void main(String[] args) {
        String tituloLibro = JOptionPane.showInputDialog(null, "Proporciona el Titulo: ");
        String autorLibro = JOptionPane.showInputDialog(null, "Proporciona el Autor: ");

        String libro = "La novela titulada " + tituloLibro + " fue escrito por el autor " + autorLibro;

        JOptionPane.showMessageDialog(null, libro);
        System.out.println(libro);

    }
}
