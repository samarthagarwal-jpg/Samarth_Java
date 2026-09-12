public class Practiceset7 
{
    //1
    /*static void mul(int n)
    {
         for(int i=1;i<=10;i++)
         {
            System.out.println(n + "X" + i + "=" + n*i);
         }
    }
    public static void main(String[] args) {
        int a=7;
        mul(a);
        
    }*/

        //2
    /*static void star(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int a=5;
        star(a);
    }*/
   
    //3
    /*static void sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a=9;
        sum(a);
    }*/

    //4
    static void avg(int n,float ...arr)
    {
        float sum=0;
        for(int i=0;i<n;i++)
        {
              sum=sum+arr[i];
        }
        System.out.println(sum/n);

    }
    public static void main(String[] args) {
        float a=5;
        float b=7;
        float c=12;
        float d=17;
        avg(4,a,b,c,d);

    }

    
}

