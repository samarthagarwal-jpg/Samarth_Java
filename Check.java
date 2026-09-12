import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        System.out.println("Taking inpiut from user ");
        Scanner sc = new Scanner(System.in);
        Boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
}
