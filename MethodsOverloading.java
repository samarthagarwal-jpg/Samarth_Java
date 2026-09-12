    public class MethodsOverloading {
    static void method()
    {
        System.out.println("Good Morning. ");
    }
    static void method(int a)
    {
        System.out.println("I have "+a+" Friends");
    }
    static void method(int a,int b)
    {
        System.out.printf("I have %d Apples and %d Bananas",a,b);
    }

    public static void main(String[] args) {
        int x=5;
        int a=9,b=12;
        method();
        method(x);
        method(a,b);        
    }
    
    
}
