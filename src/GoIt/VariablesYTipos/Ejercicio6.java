package GoIt.VariablesYTipos;

public class Ejercicio6 {
    /*
     * La tienda de drones de reparación está lista para abrir,
     sólo falta escribir un script para ordenarlos.
     Declarar variables y asignarles los valores adecuados:


pricePerDroid - el precio de un dron, valor 800
orderedQuantity - el número del pedido de los drones , valor 6
deliveryFee - el costo de la entrega, valor 50
totalPrice - el importe total del pedido a pagar, no se olvide de los gastos de envío
message - el mensaje del estado del pedido en el formato "You ordered droids worth <total price>
    credits. Delivery (<delivery fee> credits) is included in total price."
     */
    public static void main(String[] args) {
        int pricePerDroid = 800;
        int orderedQuantity = 6;
        int delivery = 50;
        int totalPrice = (pricePerDroid * orderedQuantity) + delivery;
        String message = "You ordered droids worth " + totalPrice + " credits. Delivery (" + delivery + " credits) is included in total price";

        System.out.println(message);
    }

}
