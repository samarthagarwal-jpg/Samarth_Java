import java.util.Random;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();
        
        Random ran = new Random();
        int comInput = ran.nextInt(3 );

        System.out.printf("Computer Choice: %d \n",comInput);

        if(comInput==userInput)
        {
            System.out.println("Draw!");
        }
        else if(userInput==0 && comInput==2 || userInput==1 && comInput==0 || userInput==2 && comInput==1)
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Computer Win!");
        }
        sc.close();
    }
    
}
