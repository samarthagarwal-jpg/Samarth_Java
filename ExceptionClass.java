import java.util.Scanner;
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString";
    }
    @Override
    public String getMessage()
    {
        return "I am getMessage";
    }
}

class MaxAgeException extends Exception
{
    @Override
    public String toString()
    {
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage()
    {
        return "Make the value entered less than 125";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a=130; 
        Scanner sc=new Scanner(System.in);
        //a= sc.nextInt();
        if(a<125)
        {
            try {
                //throw new MyException();
                throw new MaxAgeException();
                //throw new ArithmeticException("This is an exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //e.printStackTrace();
            }
        }
    }

}