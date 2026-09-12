import java.util.Scanner;
class MyException extends Exception
{
    public String toString()
    {
        return super.toString() + "I am toString";
    }
    public String getString()
    {
        return super.getString() + "I am getMessage";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        if(a<99)
        {
            try {
                throw new MyException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
