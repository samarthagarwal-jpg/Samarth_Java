class Cylinder2
{
    private double radius;
    private double height;
    
    public Cylinder2(int radius, int height)
    {
        this.radius=radius;
        this.height=height;
    }

    public void setRadius(double n)
    {
        this.radius=n;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setHeight(double n)
    {
        this.height=n;
    }
    public double getHeight()
    {
        return height;
    }
    public double surfaceArea()
    {
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }
    public double  volume()
    {
        return Math.PI*radius*radius*height;
    }

}


class Rectangle1
{
    private int lenght;
    private int breadth;

    public Rectangle1()
    {
        this.lenght=4;
        this.breadth=5;
    }
    public Rectangle1(int lenght,int breadth)
    {
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public double getLenght()
    {
        return lenght;
    }
    public double getBreadth()
    {
        return breadth;
    }
}
        

public class Practiceset9 {
    public static void main(String[] args) {
        /*Cylinder2 cyl = new Cylinder2(10,20);
        //cyl.setRadius(10);
        //cyl.setHeight(20);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());*/

        Rectangle1 rc = new Rectangle1(3,2);
        System.out.println(rc.getLenght());
        System.out.println(rc.getBreadth());
        
    }
    
}
