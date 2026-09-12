public class VarArgs {
    
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sum(int a, int b,int c)
    {
        return a+b+c;
    }

    static int sum(int x,int ...arr)
    {
        int result=x;
        for(int a:arr)
        {
            result+=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of nothing "+sum(1));
        System.out.println("The sum of 4 and 5 is: "+sum(1,4, 5));
        System.out.println("The sum is 4,3 and 5: "+ sum(1,4,3,5));
    }
    
}
