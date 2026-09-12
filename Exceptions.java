import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int scIndex = sc.nextInt();

        System.out.println("Enter the number to divide : ");
        int divisor = sc.nextInt();

        try{
            System.out.println("The value at the index is : "+arr[scIndex]);
            System.out.println("The result of division is : "+arr[scIndex]/divisor);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("We failed to access the array. Reason: "+ e);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("We failed to divide. Reason: "+ e);
        }
        catch(Exception e)
        {
            System.out.println("Some other Exceptions. Reason: "+ e);
        }
    }
}
