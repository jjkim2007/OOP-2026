/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;

public class Week3_Lab4 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int year = 0;
        String zodiac = "";
        
        System.out.print("Enter your birth year:");
        year = sc.nextInt();
       
        zodiac = switch(year%12) {
            case 0->"Monkey";
            case 1->"Rooster";
            case 2->"Doogie";
            case 3->"Babi";
            case 4->"Rat";
            case 5->"Ox";
            case 6->"Tiger";
            case 7->"Rabbit";
            case 8->"Dragon";
            case 9->"Snake";
            case 10->"Horse";
            case 11->"Sheep";
               default-> "";
        };
        System.out.println("Your chinese zodiac is "+ zodiac);
    }
}
