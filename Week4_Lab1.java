/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */

import java.util.Scanner;

public class Week4_Lab1 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
        int no=0, total=0, count=0;
        double average = 0;
        final int SENTINAL = 0;
        do {

        //Let user enter number 
        System.out.print("Enter a number or '0' to end the process : ");
        no = sc.nextInt();
        
        //Accumulate the number of total variable
        total +=no;
        //Con=unter increase by 1
        count++;
        
        }
        while (no != SENTINAL);
        
        count --;
        
        if (total != 0)
        average = total/count ;
       
        else {
                System.out.println("No number was entered!");
                System.exit(0);    
        }
    //task 5 show the average, total and number count
         System.out.println(average + " is average " + total + " is total" +  count +" is count ");
            
    }
}

