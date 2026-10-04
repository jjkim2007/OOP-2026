import java.util.Scanner;
public class Week2_Lab7 {
    public static void main(String args[]) {
       Scanner sc = new Scanner (System.in);
       int no1=0, no2=0, no3=0;
       
       System.out.print("Enter number 1:");
       no1 = sc.nextInt();
       
       System.out.print("Enter number 2:");
       no2 = sc.nextInt();
       
       System.out.print("Enter number 3:");
       no3 = sc.nextInt();
              double answer = Math.sqrt((no1*no1) + (no2*no2) + (no3*no3));


System.out.printf("The magnitude is %.2f %n", answer);       
    }
}
