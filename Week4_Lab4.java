/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Scanner;
import java.util.Random;

public class Week4_Lab4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int guess = 0, computer = 0, guessCount = 0;
        String nextGuess = "Y";

        while (nextGuess.equals("Y")) {
            //task1: Let computer generate a random number from 0->100

            computer = rnd.nextInt(1, 101);
            while (guess != computer) {
                System.out.print("Guess number (1-100): ");
                guess = sc.nextInt();

                if (guess > computer) {
                    System.out.println("Your guess is too big");
                } else if (guess < computer) {
                    System.out.println("Your guess is too small");
                } else {
                    System.out.println("Congrats, you guess the correct answer");
                }

                guessCount++;
            }
           
            System.out.println("You use " + guessCount + " to guess the number");
            System.out.print("Next guess [Y/N]:");
            nextGuess = sc.next().toUpperCase(); //auto y -> Y
            guessCount = 0;
        }//outer while loop {Y}
    }

}
