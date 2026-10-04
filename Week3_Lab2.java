/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;
public class Week3_Lab2 {
    public static void main(String args[]) {
        //Create keyboard object
        Scanner sc = new Scanner(System.in);
        double height=0.0, weight=0.0;
        double bmi=0.0; 
        
        //Prompt the user to enter the weight (kg)
        System.out.print("Enter your weight in KG: ");
        weight = sc.nextDouble();
        
       //Prompt the user the height (meter)
       System.out.print("Enter your height in METER:");
       height = sc.nextDouble();
       
       //Calculate the bmi
       //bmi = height/ (Weight **2)
       bmi = weight / (height * height);
       
       //Print out the BMI in 2 decimal places
        System.out.printf("Your BMI Index is %,2f %n", bmi);
        if (bmi < 18.5)
            System.out.println("Underweight Category!");
        else if (bmi<25.0) //(bmi >= 18.5 && bmi <= 24,9)
            System.out.println("Healthy Weight Wategory!");
        else if (bmi<30.0)
            System.out.println("Overweight Category");
        else if (bmi<35.0)
            System.out.println("Obese Class 1 category");
        else if (bmi<40.0)
            System.out.println("Obese Class 2 category");
        else
            System.out.println("Obese Class 3 category");
        
                
    }
}