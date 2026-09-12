public class MethodsJava {

    //1

    /*static void tellJoke()
    {
        System.out.println("Hii,\nMy name is Samarth Agarwal.");

    }
    static int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            x++;
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=10,b=5;
        int c;
        c=logic(a,b);
        System.out.println(a);

        //MethodsJava obj =new MethodsJava();
        //c=obj.logic(a, b);
        System.out.println(c);
        tellJoke();  
    }   */

        //2

    static void change(int []arr)
    {
        arr[0]=98;
    }
    public static void main(String[] args) {
        
        //Case 1 changing the integer
        /*int x=45;
        change(x);
        System.out.println("The value of X after running change is:"+x);*/

        //case 2 changing the array
        int []arr={1,2,3,4,5};
        change(arr);
        System.out.println(arr[0]);
  
        
    }
    
}
