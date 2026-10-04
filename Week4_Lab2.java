/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class Week4_Lab2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int table = 0;
       
        
        //task1 promopt the user to enter table no from 1 to  12
        //use a while loop to validate the user input
       do{
       System.out.print("Enter multiplication table (1=12): ");
       table = sc.nextInt() ;
      
       if  (table <1 || table>12)
               System.out.println("The table no is out of range!");
    
    }while (table<1 || table>12);
       
       for (int i=1; i<13; i++) { 
           System.out.printf("%d x %d = %d/%n", i, table, (i*table));
       }
    
    }
}
