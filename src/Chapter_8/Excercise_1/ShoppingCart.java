package Chapter_8.Excercise_1;

//Call the setColor method on item1.  If it returns true,
//print out item1.color.  If it returns false, print an
//invalid color message.

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print an appropriate message, 
	//  depending upon the return value.

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}
