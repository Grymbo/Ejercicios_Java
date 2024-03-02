package GoIt.VariablesYTipos;

public class Ejercicio4 {
    /*
    Complete el código asignando,
    de la expresión de la variable totalPrice para calcular el importe total del pedido.
    La variable pricePerItem almacena el precio de un artículo y orderedQuantity
    almacena el número de artículos del pedido.
    * */
    public static void main(String[] args) {
        int pricePerItem = 3500;
        int orderedQuantity = 4;
        int totalPrice = pricePerItem * orderedQuantity;
        System.out.println(totalPrice);
    }
}
