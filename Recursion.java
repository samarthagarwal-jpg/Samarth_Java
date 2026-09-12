

public class Recursion {
    static int fact(int a)
    {
    if(a<=1)
    {
        return a;
    }
    else
    {
        return fact(a-1)+fact(a-2);
    }
    }

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
        System.out.println(fact(i));
        }
    }
}
