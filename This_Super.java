class EkClass
{
    int a;
    public int getA() {
        return a;
    }

    EkClass(int a)
    {
        this.a=a;
    }
    
}
class DoClass extends EkClass
{
    DoClass(int b)
    {
        super(b);
        System.out.println("I am a Constructor "+b);
    }
}
public class This_Super {
    public static void main(String[] args) {
        EkClass e =new EkClass(44);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
