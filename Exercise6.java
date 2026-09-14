import java.util.Scanner;

class InvalidInput extends Exception
{
    @Override 
    public String toString()
    {
        return "Negative Input";
    }
}
class DevidedBy0 extends Exception
{
    @Override 
    public String toString()
    {
        return "Devided by 0";
    }
}
class MaxInput extends Exception
{
    @Override 
    public String toString()
    {
        return "Max value of Input reaches (100000)";
    }
}
class MaxMul extends Exception
{
    @Override 
    public String toString()
    {
        return "Max Multiplier reached (7000)";
    }
}

class CustomCalc
{
    double Add(double a, double b) throws InvalidInput,MaxInput
    {
        if(a>100000 || b>100000)
        {
            try{
                throw new MaxInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a<0 || b<0)
        {
            try{
                throw new InvalidInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        return a+b;
    }

    double Sub(double a, double b) throws InvalidInput,MaxInput
    {
        if(a>100000 || b>100000)
        {
            try{
                throw new MaxInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a<0 || b<0)
        {
            try{
                throw new InvalidInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        return a-b;
    }

    double Mul(double a, double b) throws InvalidInput,MaxInput,MaxMul
    {
        if(a>100000 || b>100000)
        {
            try{
                throw new MaxInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a<0 || b<0)
        {
            try{
                throw new InvalidInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a>7000 || b>7000)
        {
            try{
                throw new MaxMul();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        return a*b;
    }

    double Div(double a, double b) throws InvalidInput,MaxInput,DevidedBy0
    {
        if(a>100000 || b>100000)
        {
            try{
                throw new MaxInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a<0 || b<0)
        {
            try{
                throw new InvalidInput();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(b==0)
        {
            try{
                throw new DevidedBy0();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        return a/b;
    }
}
public class Exercise6 {
    
    public static void main(String[] args) throws InvalidInput,DevidedBy0,MaxInput,MaxMul {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        CustomCalc c = new CustomCalc();
        c.Add(a, b);
        c.Sub(a, b);
        c.Mul(a, b);
        c.Div(a, b);
        
    }
    
}
