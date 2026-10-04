/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import java.util.Random;

public class Week5_Lab3 {
    public static void main(String args[] ){
    String password = getPassword();
        System.out.println("Your password is: " + password);
}

    private static String getPassword() {
        String text = "012345678!@$%AEIOU";
        String password = "";
        Random rnd = new Random();
        for (int i=0; i<8; i++) {
            int index = rnd.nextInt(0, text.length()-1);
            
            //get sym/letter/digit
            char value = text.charAt(index) ;
            
            //form a password using +
            password = password + value;
        }       return password;
    }
}