/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author h1030
 */
import javax.swing.*;

public class Week3_Lab1 {
    public static void main(String args[]) {
        String temp="";
        int no1=0, no2=0;
        
       //prompt  the user to enter no1 with dialog box
       temp = JOptionPane.showInputDialog("Enter number 1");
       
       //convert the temp into an integer value
       no1 = Integer.parseInt(temp);
       //enter next number
       
       temp = JOptionPane.showInputDialog("Enter number 2");
       no2 = Integer.parseInt(temp);
       
       //print our the results in a dialog box
        //if no1 = 5, no2 = 8
        // 5<8
        if (no1 > no2)
        temp = no1 + " > " + no2;
        else if (no2 > no1)
            temp = String.format("%d > %d", no2, no1);
        else
            temp = String.format("%d == %d, no2, no1");
        
        JOptionPane.showMessageDialog(null, temp, "Result",  JOptionPane.WARNING_MESSAGE);
        
       /*
        JOptionPane.INFORMATION_MESSAGE
        JOptionPane.WARNING_MESSAGE
        JOptionPane.ERROR_MESSAGE
        JOptionPane.QUESTION_MESSAGE
        */
    }
}
