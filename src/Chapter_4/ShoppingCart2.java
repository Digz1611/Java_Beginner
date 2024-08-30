package Chapter_4;
public class ShoppingCart2 {
    public static void main(String[] args) {
        String custName = "Diego Langeveldt";
        String itemDesc = "Chevrolet Camaro ZL1";
        String message = custName+" wants to purchase a "+itemDesc;
        double price = 72000;
        int quantity = 2;
        double tax = 1.04;
        double total;
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        System.out.println(message);
        total = quantity * price * tax;
        System.out.println("Total cost with tax: "+total);
    }
}
