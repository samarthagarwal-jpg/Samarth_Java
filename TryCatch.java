public class TryCatch {
    public static void main(String[] args) {
        int a=6000;
        int b= 9;
        try{
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to devide. Reason: "+ e);
        }
        System.out.println("End of the program.");
    }
}
