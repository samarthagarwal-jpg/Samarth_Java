public class Finally {
    public static int greet()
    {
        try
        {
            int a=50;
            int b=2;
            int c =a/b;
            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
        System.out.println("End of program");
        }

        System.out.println("Cleanup");
        return -1;

    }
    public static void main(String[] args) {
        //int k=greet();
        //System.out.println(k);
        int a=100;
        int b=10;
        while(true)
        {
            try
            {
                System.out.println(a/b);
            }
            catch (Exception e) {
                 System.out.println(e);
                 break;
            }
            finally
            {
                System.out.println("I am finally for value of b ="+b);
            }
            b--;
        }

        try{
            System.out.println(5/0);
        }
        finally
        {
            System.out.println("Yes this is finally");
        }
    }
    
}
