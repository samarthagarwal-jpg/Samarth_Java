import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.println("Enter the array index : ");
        int scIndex = sc.nextInt();


        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                System.out.println("The value at the index is : "+arr[scIndex]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("We failed to access the array. Reason: "+ e);
                System.out.println("inner catch block");
            }
        }
        catch(Exception e)
        {
            System.out.println("Some other Exceptions. Reason: "+ e);
            System.out.println("outer catch block");
        }
    }
    }
    
}
