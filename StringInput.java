import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        
        System.out.println("Taking a string input ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
    
}
