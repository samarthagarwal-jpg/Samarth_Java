import java.util.Scanner;

public class PracticeSet6 {
    public static void main(String[] args) {
        //1
        /*float sum=0;
        float []arr={10.6f,40.5f,38.7f,27.4f,55.9f};
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);*/

        //2
        /*Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat(); 
        float []arr={10.6f,40.5f,38.7f,27.4f,55.9f};
        boolean inArray=false;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                inArray=true;
                break;
            }
            
        }
        if(inArray)
            {
                System.out.println("The searched element is here.");
            }
            else
            {
                System.out.println("The search element is not here.");
            }*/
            

        //3
        /*float sum=0;
        float []arr={10.6f,40.5f,38.7f,27.4f,55.9f};
        for(float element:arr)
        {
            sum+=element;
        }
        System.out.println("the average value is: "+sum/arr.length);
        */

        //4
        /*int [][]mat1={{1,2,3},{4,5,6}};
        int [][]mat2={{7,8,9},{6,8,2}};
        

        for(int i=0;i<mat2.length;i++)
        {
            for(int j=0;j<mat2[i].length;j++)
            {
             System.out.printf("\t%d",mat1[i][j]+mat2[i][j]);
            }
            System.out.printf("\n");
        }*/

        //5
        /*int []arr={13,4,67,18,7};
        int max=0;
        for(int e:arr)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println(max);
        */

        //6
        int []arr={1,4,6,8,9};
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted)
        {
        System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
       


    }
    
}
