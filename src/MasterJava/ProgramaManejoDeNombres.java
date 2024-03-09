package MasterJava;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu primer familiar");
        String primerFamiliar = scanner.nextLine();

        System.out.println("Ingresa tu segundo familiar");
        String segundoFamiliar = scanner.nextLine();

        System.out.println("Ingresa tu tercer familiar");
        String tercerFamiliar = scanner.nextLine();

        String familiar1 = primerFamiliar.substring(1,2).toUpperCase() + "." + primerFamiliar.substring(primerFamiliar.length()-2);
        String familiar2 = segundoFamiliar.substring(1,2).toUpperCase() + "." + segundoFamiliar.substring(segundoFamiliar.length()-2);
        String familiar3 = tercerFamiliar.substring(1,2).toUpperCase() + "." + tercerFamiliar.substring(tercerFamiliar.length()-2);


        System.out.println(familiar1 + "_" + familiar2 + "_" + familiar3);
    }
}
