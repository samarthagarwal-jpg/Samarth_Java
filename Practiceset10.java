class Circle1
{
    public int radius;
    public double area;
    Circle1(int r)
    {
        this.radius=r;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    } 
}
class Cylinder1 extends Circle1
{
    public int height;
    public double volume;
    Cylinder1(int r, int h)
    {
        super(r);
        this.height=h;
    }
    public double volume()
    {
        return Math.PI*height*radius*radius;
    }
}

class Rectangle
{
    public int lenght;
    public int breadth;
    public double area;

    Rectangle(int l, int b)
    {
        this.lenght=l;
        this.breadth=b;
    }
    public double area()
    {
        return lenght*breadth;
    }
}
class Cuboid extends Rectangle
{
    public int height;
     
    Cuboid(int l, int b, int h)
    {
        super(l,b);
        this.height=h;
    }
    public double volume()
    {
        return lenght*breadth*height;
    }
}
public class Practiceset10 {
    public static void main(String[] args) {

        //1
        /*Cylinder1 cyl = new Cylinder1(2,4);
        System.out.println(cyl.volume());*/
    
        //2
        Cuboid cub = new Cuboid(1, 2, 3);
        System.out.println(cub.area());

    }
    
}
