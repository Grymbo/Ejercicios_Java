package GoIt.VariablesYTipos;

public class Ejercicio2 {

    /*
    *El nombre del objeto ha sido cambiado por "Repair droid" y su precio se
    * ha incrementado en 1500 créditos.
    * Anule los valores de las variables pricePerItem y productName después de su declaración.
    * */
    public static void main(String[] args) {
        String productName = "Droid";
        int pricePerItem = 2000;

        productName = "Repaird Droid";
        pricePerItem = 1500;

        System.out.println(productName);
        System.out.println(pricePerItem);
    }
}
