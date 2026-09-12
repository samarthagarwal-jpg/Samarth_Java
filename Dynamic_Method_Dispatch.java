class Phone
{
    public void swagat()
    {
        System.out.println("Apka swagat hai");
    }
    
    public void on()
    {
        System.out.println("Turning on a phone ");
    }
}
class Smartphone extends Phone
{
    public void greet()
    {
        System.out.println("Good Morning");
    }
    public void on()
    {
        System.out.println("Turning on a smartphone ");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //Phone obj =new Phone();
        //Smartphone smobj =new Smartphone();
        //obj.name();

        Phone obj = new Smartphone();
        //Smartphone obj2 = new Phone(); //not allowed
        //obj.greet();  //not allowed
        obj.swagat();
        obj.on();
    }
}
