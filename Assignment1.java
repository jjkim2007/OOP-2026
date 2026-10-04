/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0; // total food price
        char orderNext = 'Y'; // preset as Y first

        while (Character.toUpperCase(orderNext) == 'Y') { // Y and y both can run the loop (more order)
            
            displayMenu(); // Call method to show the menu
            
            int choice = scanner.nextInt();
            
            // Call method to process order and add current price to total price
            totalPrice += processOrder(choice); 
            
            System.out.print("Do you want to order next item [Y/N]? ");
            orderNext = scanner.next().charAt(0); // read Y/N so continue or not
        }
        
        // print after loop finish, use .2f to control it to only 2 decimals
        System.out.printf("Total Price: RM %.2f%n", totalPrice); 
        scanner.close(); 
    }

    /**
     * Displays option and price
     */
    public static void displayMenu() {
        System.out.println("--- INTI penang Lite Lunch Lounge Menu ---");
        System.out.println("1. Coffee (RM 1.80)");
        System.out.println("2. Soft drink (RM 2.00)");
        System.out.println("3. Dessert (RM 3.50)");
        System.out.println("4. Starter (RM 4.00)");
        System.out.println("5. Main Course (RM 8.00)");
        System.out.println("6. Main Course + Dessert (RM 11.00)");
        System.out.println("7. Main Course + Starter (RM 11.50)");
        System.out.println("8. Combo (Main Course + Starter + Dessert) (RM 15.00)");
        System.out.print("What course(s) do you want to order? (Select 1-8): ");
    }

    /**
     * run user choice, output the item which need to provide + return price
     * 
     * @param choice The menu option selected by the user (1-8).
     * @return The price of the selected menu item.
     */
    public static double processOrder(int choice) {
        double itemPrice = 0.0; // current food prices
        
        switch (choice) { // case = 12345678 food type
            case 1:
                itemPrice = 1.80;
                System.out.println("To Provide: Coffee"); // no main no free
                break;
            case 2:
                itemPrice = 2.00;
                System.out.println("To Provide: Soft drink"); // no main no free
                break;
            case 3:
                itemPrice = 3.50;
                System.out.println("To Provide: Dessert"); // no main no free
                break;
            case 4:
                itemPrice = 4.00;
                System.out.println("To Provide: Starter"); // no main no free
                break;
            case 5:
                itemPrice = 8.00;
                System.out.println("To Provide: Main Course (No free drinks provided)"); // only main no free
                break;
            case 6:
                itemPrice = 11.00;
                System.out.println("To Provide: Main Course, Dessert, and a Free Coffee");
                break;
            case 7:
                itemPrice = 11.50;
                System.out.println("To Provide: Main Course, Starter, and a Free Soft Drink");
                break;
            case 8:
                itemPrice = 15.00;
                System.out.println("To Provide: Main Course, Starter, Dessert, a Free Soft Drink, and a Free Coffee");
                break;
            default: // for useless or invalid case
                System.out.println("Invalid selection.");
                break;
        }
        return itemPrice;
    }
}//yay finish
