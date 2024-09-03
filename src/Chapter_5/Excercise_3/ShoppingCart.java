package Chapter_5.Excercise_3;
public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Diego Langeveldt";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
       
        String items[];
        items = new String[4];
        items[0] = "Camaro";
        items[1] = "911";
        items[2] = "DB12";
        items[3] = "R8";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
        // Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");
        
        for (String item : items ){
           System.out.print(item + ", ");
        }
    }    
}
