/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
 import java.util.Scanner;

public class Week5_Lab1 {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        String name = "";
        int productCode =0;
        
        System.out.println("Enter customer name: ");
        name = sc.nextLine();
        
        System.out.println("Enter product code: ");
        productCode = sc.nextInt();
        
        //method implementation
        printReport(name, productCode);
    }
    
private static void printReport(String name, int productCode) {
    System.out.println("Customer name: " + name);
    System.out.println("Product Code: " + productCode);
    }


}
