public class Week2_Lab6 {
    public static void main(String agrs[]) {
        String name = "Tan Bynn Bynn";
        int semester = 3;
        double cgpa = 3.71;
        char gender = 'M';
        String output = "";
        
        System.out.println(name + " is in Semester " + semester + " with cgpa" +  cgpa + "." + "Gender is " + gender );
        
        System.out.printf("%s is in Semester %d with cgpa %.2f. Gender is %c" , name,semester,cgpa,gender );

        System.out.println(output);
    }
}