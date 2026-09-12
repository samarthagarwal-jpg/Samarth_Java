abstract class Base
{
    public Base()
    {
         System.out.println("I am a base constructer");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}
class Child extends Base
{
    public void me()
    {
        System.out.println("I am child class");
    }
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2()
    {
        System.out.println("Good afternoon");
    }
     
}
abstract class Child1 extends Base
{
    public void th()
    {
        System.out.println("I am good");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Child c= new Child();
        c.sayHello();
        c.me();
        //Base b = new Base(); //not possible
        //Child1 c1 = new Child1(); //not possible
    }
    
}
