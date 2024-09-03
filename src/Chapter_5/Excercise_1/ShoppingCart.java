package Chapter_5.Excercise_1;
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Diego Langeveldt";
        String itemDesc = "Chevrolet Camaro ZL1";
        // numeric fields
        double price = 72000;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName+" wants to purchase "+quantity+" "+itemDesc;
        // Calculating total cost
        total = (price*quantity)*tax;
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
        // Test quantity and modify message if quantity > 1.
        if (quantity > 1){
            message = message +"s";
        }
        // Test outOfStock and notify user in either case.
        if (outOfStock){
            System.out.println(itemDesc+" is out of stock.");
        }
        else{
            System.out.println(message);
            System.out.println("Total cost with tax: "+ total);
        }
    }
}
