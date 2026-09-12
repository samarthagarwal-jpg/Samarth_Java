import java.util.Scanner;

public class Practiceset {
    public static void main(String[] args) {
//1.
       /* float a=7/4.0f*9/2.0f;
        System.out.println(a);*/
//2.
//incrypting the grade
        char grade ='B';
        grade = (char)(grade+8);
        System.out.println(grade);
//decrypting the  grade
        grade = (char)(grade-8);
        System.out.println(grade);

//3.
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();

        System.out.println(60>b);

//4.
        float v=10;
        float u=5;
        float a=2;
        float s=4;
        float ex=(v*v-u*u)/(2*a*s);
        System.out.println(ex);

        sc.close();
    }

    
}
