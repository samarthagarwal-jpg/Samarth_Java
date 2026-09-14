import java.util.Scanner;
class MaxTries extends Exception
{
    @Override
    public String toString()
    {
        return "Max tries reaches";
    }
    @Override
    public String getMessage()
    {
        return "Max tries reaches";
    }
}

public class Practiceset14{

    public static void maxTry(int i) throws MaxTries
    {
        if(i>=5)
        {
            try {
                throw new MaxTries();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                
            }
        }
    }

    public static void main(String[] args) throws MaxTries {
        //problem 1
        //int a =7    Syntax Error
        int age=78;
        int yearborn = 2000-age;  ///Logical error
        //System.out.println(6/0);  //Runtime error

        //problem 2
        /*try{
            int a=666/9;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Hahaa");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Hihi");
        }*/

        //problem 3
        int [] marks= new int[3];
        marks[0]=67;
        marks[1]=53;
        marks[2]=72;
        boolean flag =true;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;

        while (flag && i<5) {
            try{
            System.out.println("Enter the value of index");
            index=sc.nextInt();
            System.out.println("The value of marks{index} is "+marks[index]);
            break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Exception");
                i++;
            }
        }
        maxTry(i);
        
    }
}