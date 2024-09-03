package Chapter_5.Excercise_2;
public class ShoppingCart {
    public static void main(String[] args) {
         // local variables
        String custName = "Diego Langeveldt";
        String message = custName + " wants to purchase a several items.";
        String[] items = {"Camaro","911","DB12","R8"};
        // Change message to show the number of items purchased.
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        // Print an element from the items array.
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
        System.out.println(items[3]);
    }    
}