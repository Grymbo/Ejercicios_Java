package GoIt.VariablesYTipos;

public class Ejercicio5 {
    /*
    Declare la variable message y escriba en ella un mensaje sobre la compra,
    la secuencia con el formato: message <nombre del artículo>,
    price per item is <precio del artículo> credits".
    Donde <nombre del artículo>yprecio del artículo>son los
    valores de las variablesproductNameypricePerItem`.
    Use la sintaxis de la secuencia de las plantillas./
     */
    public static void main(String[] args) {
        String productName = "Droid";
        int pricePerItem = 3500;
        String message = "You picked " + productName + ", price per item is " + pricePerItem + " credits";

        System.out.println(message);
    }
}
