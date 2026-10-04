/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class LabTestAhhhhh {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);  
    String name;
    int days;
    double totalTemp = 0;
    String nextCity;
   
    do{
        totalTemp = 0;
        
        System.out.println("Enter city name: ");
        name = sc.nextLine();
        
        System.out.println("Enter number of days (3-6 days):");
        days = sc.nextInt();
        
        for (int i = 1; i<=days; i++){
            double temp;
            do{
                System.out.println("Enter the temperature for day " + i + ": ");
                temp =  sc.nextDouble();
            
            if (temp < 27 || temp > 40){
                System.out.println("The temperature out of range already, pls enter between 27 to 40 celcius. ");
            }
            }while (temp < 27|| temp > 40); //only exit after key in temperature around 27+40
            
            totalTemp = totalTemp + temp;
        }
        if (days >2 && days <7){
            double avg = totalTemp / days;
            System.out.println("The average temperature for days" + days + " is " + avg + "celcius");
        }
        System.out.println("Continue entering data for next City? (Y/N)");
        nextCity = sc.next();
        
        sc.nextLine();
        
    } while (nextCity.toUpperCase().equals("Y"));
            System.out.println("Program End");

    }
    
    

}
