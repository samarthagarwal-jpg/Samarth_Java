class Base1
{
    Base1()
    {
        System.out.println("I am a Constructor");
    }
    Base1(int x)
    {
        System.out.println("I am a Overloaded Constructor with the value of x as: "+x);
    }
}

class Derived1 extends Base1
{
    Derived1()
    {
        //super(0);
        System.out.println("I am a Derived Class Constructor");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am a Overloaded Derived Class Constructor with value of y as: "+y);
    }

}

class ChildDerived extends Derived1
{
    ChildDerived()
    {
        System.out.println("I am a child of derived constructor");
    }
    ChildDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am a Overloaded Child of Derived Constructor with value of z as: "+z);
    }
    
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        //Base1 b=new Base1();
        //Derived1 d=new Derived1();
        //Derived1 d=new Derived1(14,9);
        //ChildDerived cd =new ChildDerived(); 
        ChildDerived cd = new ChildDerived(1,2,3);

    }
    
}
