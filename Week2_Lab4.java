public class Week2_Lab4{
    public static void main (String args[]) {
        int no1=4, no2=5, no3=6;
        var total = no1+no2+no3;
        System.out.println(no1 + " + " + no2 + " + " + no3 + " = " + total ); 
        
        
        //approach 2: formmated print
        //%d: int, %f: double/float, %s:string, %c:char
        System.out.printf("%d + %d + %d = %d %n", no1,no2,no3,total);
    }
}
