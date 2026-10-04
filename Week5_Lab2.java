/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class Week5_Lab2 {
   public static void main(String args[] ){
       Scanner sc = new Scanner(System.in);
       int no1 = 0, no2 = 0; 
      
       
       //prompt the user to enter number 1
     no1 = inputNumber(sc, "Enter number 1:");
      
      //prompt the user to enter number 2 
      no2 = inputNumber(sc, "Enter number 2:");       
       
      printAverage(no1, no2);
       //find the total and display the average
}
   public static void printAverage(int n1, int n2) {
       int total = n1 + n2;
       var average = total / 2.0;
       System.out.println("The total is " + total);
       System.out.println("The average is " + average);
   }
   
   
   public static int inputNumber(Scanner sc, String promptMessage) {
       System.out.print(promptMessage);
       int no = sc.nextInt();
       return no; //give back value
       }

   }

