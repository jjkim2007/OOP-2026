import java.io.FileWriter;
import java.io.PrintWriter;

public class Week6_Lab1 {
    public static void main(String args[])  throws Exception{
        //write soomething to the file (scores.txt)
        FileWriter fw = new FileWriter("scores.txt");
        //Make the file able to use the printIn command
        PrintWriter pw = new PrintWriter(fw);
        double score = 0;
        
        //Write 10 scores, in the range of 0.0 - 10.0
        for(int i=0; i<10; i++){
            
            score = getScore(0,10);
            
            //write the score to the file
            pw.println(score);
        }
        //close the file writer and print writer 
        //P/S: if file wasnt close, data will not be saved
        fw.close();
        pw.close();
    }
    public static double getScore(int low, int high){
        java.util.Scanner sc = new java.util.Scanner(System.in); //if util isnt typed on the top
        double score = 0.0;
        
        //write a loop to validate the user input( 0 - 10 )
        do{
        System.out.print("Enter a score (0-10):");
        score = sc.nextDouble();
        
        if(score < 0 || score > 10){
            System.out.println("Score is not in the range!");
        }
        }while (score < 0 || score > 10);
        
        return score;
        
    }
}
