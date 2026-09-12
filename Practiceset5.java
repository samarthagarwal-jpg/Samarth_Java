import java.util.Scanner;

public class Practiceset5 {
    public static void main(String[] args) {
        //1
        /*for(int i=0;i<4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //2
        int temp=0;
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            temp=temp+i;
        }
        System.err.println(temp);

        //3
        /*Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }*/

        //4
        int n=5;
        int i=1;
        int fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.err.println(fact);
        sc.close();
    }
    
}
