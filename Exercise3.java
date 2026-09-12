import java.util.Random;
import java.util.Scanner;
class game
{
    int number;
    int inputNumber;
    int noOfGuesses=0;
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses=noOfGuesses;
    }


    game()
    {
        Random ran = new Random();
         this.number = ran.nextInt(100 );
    }
    void takeUserInput()
    {
        System.out.println("Guess The Number");
        Scanner sc=new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(inputNumber==number)
        { 
            System.out.printf("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Low...");
        }
        else if(inputNumber>number)
        {
            System.out.println("High...");
        }
        return false;

    }

}
public class Exercise3 {
    public static void main(String[] args) {

        game g = new game();
        boolean b=false;
        while (!b) 
        {
        g.takeUserInput();
        b=g.isCorrectNumber();   
        }        
    }
    
}
