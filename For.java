import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }*/

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(2*i+1);
        }
        

        for(int i=5;i>0;i--)
        {
            System.out.println(i);
        }
        sc.close();

}    
}
