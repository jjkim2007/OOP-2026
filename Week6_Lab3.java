/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Random;
import java.util.Scanner;
public class Week6_Lab3 {
    public static void main(String args[]) {
        Random rnd = new Random();
        int no1=0, no2=0, answer=0;
        
        no1 = getRandomNumber(rnd, 100,1000);
        no2 = getRandomNumber(rnd, 100,1000);
        printQuestion(no1, no2);
        
        answer = getAnswer();
        
        boolean isCorrect = checkAnswer(no1, no2, answer);
        if (isCorrect)
            System.out.println("Your answer is right");
        else
            System.out.println("Wrong, please try again");
    }
    /**
 
     * @param n1 The 1st number entered by user
     * @param n2 The 2nd number entered by user
     * @param answer The actual number
     * @return true/false
     */
    public static boolean checkAnswer(int n1, int n2, int answer){
        return (answer == (n1+n2));
    }
  /**
   * To prompt the user to enter an answer
   * @return  user's answer
   */
   public static int getAnswer(){
       Scanner sc = new Scanner (System.in);
           int value =0;
         System.out.print("Enter your answer: ");
         value = sc.nextInt();
        return 0;
         
   }
   /**
    * 
    * @param no1 The first random integer value
    * @param no2 The second random integer value
    */
        public static void printQuestion(int no1, int no2){
        System.out.printf("%5d %n", no1);
        System.out.printf("+ %3d %n", no2);
        System.out.println("-----");
        System.out.println("  ?  ");
        System.out.println("-----");
    }

/**
 * 
 * @param rnd
 * @param low
 * @param high
 * @return 
 */
    private static int getRandomNumber(Random rnd, int low, int high) {
        //high number is exclusive(not included)
      int no = rnd.nextInt(low, high);
      return no;
    }
}
