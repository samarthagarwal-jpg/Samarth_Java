import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        
        /*int a = 10;
        int b = 5;
        System.out.println("The sum of a and b is: " + (a + b));

        //logical error
        //Write a program to print the prime numbers from 1 to 10
        System.out.println(2);
        for (int i = 1; i <5; i++) {
            System.out.println(2*i+1);
        }
        */

        //Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

    }
}
