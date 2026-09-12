class Base2
{
    int x;
    public void setX(int n)
    {
        System.out.println("I am in Base and I am setting X");
        this.x=n;
    }
    public int getX() {
        return x;
    }

    public void printMe()
    {
        System.out.println("I am a method");
    }
}

class Derived extends Base2
{
    public int y;
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

class Derive extends Derived
{
    public int z;
    public void setZ(int z) {
        this.z = z;
    }
    public int getZ() {
        return z;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        
        Base2 b=new Base2();
        b.setX(4);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(43);
        System.out.println(d.getX());

        Derive m = new Derive();
        m.setX(5);
        System.out.println(m.getX());
        
    }
    
}
