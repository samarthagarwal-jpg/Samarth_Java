import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("you are going to join the job ");
            case 60 -> System.out.println("you are going to get retired ");
            default -> System.out.println("Enjoy your life ");
        }
        sc.close();
    }
    
}
