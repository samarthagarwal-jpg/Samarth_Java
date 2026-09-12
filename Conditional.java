public class Conditional {
    public static void main(String[] args) {
        int age =36;
        boolean con = (age>18);
        if (con)
            {
                System.out.println("you can drive");
            } 
        else
            {
                System.out.println("You cannot drive");
            }
    
//logical AND
    boolean a=true;
    boolean b=true;
    boolean c=true;
    if (a&&b&&c)
    {
        System.out.println("y");
    }
    else
    {
        System.out.println("n");
    }

//logical OR
    boolean a1=true;
    boolean b1=true;
    boolean c1=false;
    if (a1||b1||c1)
    {
        System.out.println("y");
    }
    else
    {
        System.out.println("n");
    }
    
}
}
