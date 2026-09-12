import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter the no. of All five subjects: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths: ");
        float a =sc.nextFloat();
        System.out.println("Enter the marks of Science: ");
        float b =sc.nextFloat();
        System.out.println("Enter the marks of Social studies: ");
        float c =sc.nextFloat();
        System.out.println("Enter the marks of English: ");
        float d =sc.nextFloat();
        System.out.println("Enter the marks of Hindi: ");
        float e =sc.nextFloat();
        float total = a+b+c+d+e;
        float per= (a+b+c+d+e)/5;
        System.out.println("The total marks obtained is: " + total);
        System.out.println("The total percentage is: " + per);
        sc.close();
    }
}
