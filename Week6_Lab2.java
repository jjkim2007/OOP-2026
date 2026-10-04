/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.io.FileReader;
import java.util.Scanner;

public class Week6_Lab2 {    
    public static void main(String args[])  throws Exception {
        FileReader fr = new FileReader("scores.txt");
        Scanner sc = new Scanner(fr); //read the file (file reader)
        double score = 0, total = 0;
        int count = 0;
        
        while (sc.hasNext()) {
            score = sc.nextDouble();
            
            total += score;
            count++; //increase by 1
            
            System.out.printf("Score %d = %.2f %n", count, score);
        }
        double average = total / count;
        System.out.printf("Total %.2f %n", total);
        System.out.printf("Average %.2f %n", average);
        sc.close();
    }
}
