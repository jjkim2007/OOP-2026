/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class Week3_Lab3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int no1=0, no2=0, no3=0;
        
        //prompt the user to enter 3 number
        System.out.println("Enter number 1");
        no1 = sc.nextInt();
        
        System.out.println("Enter number 2");
        no2 = sc.nextInt();
        
        System.out.println("Enter number 3");
        no3 = sc.nextInt();
        
        
        //print the  umber in ascending number
        //e.g. 2 4 8
        if (no1<=no2 && no1<=no3 ){ //1
            System.out.print(no1 + " "); //print out number 1 first
            if (no2 <= no3)
                System.out.print(no2 + " "+ no3);
            else
                System.out.print(no3 + " "+ no2);
        }
        else if (no2<=no1 && no2<=no3) { //2
             System.out.print(no2 + " "); //print out number 1 first
            if (no1 <= no3)
                System.out.print(no1 + " "+ no3);
            else
                System.out.print(no3 + " "+ no1);
        }
        else if (no3<=no2 && no3<=no1) {//3
             System.out.print(no3 + " "); //print out number 1 first
            if (no1 <= no2)
                System.out.print(no1 + " "+ no2);
            else
                System.out.print(no2 + " "+ no1);
        }
        
    }
    
}
