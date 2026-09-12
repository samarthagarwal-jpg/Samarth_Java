class MyEmployee
{
    private int id;
    private String name;

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int n)
    {
        id=n;
    }
    public int getId()
    {
        return id;
    }
}

class Circle
{
    private double radius;
    private double area;
    private double parameter;

    public void setRadius(double n)
    {
        radius=n;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setArea(double n)
    {
        area=n;
    }
    public double getArea()
    {
        return area;
    }
    public void setParameter(double n)
    {
        parameter=n;
    }
    public double getParameter()
    {
        return parameter;
    }
}

public class AccessMod {
    public static void main(String[] args) {
        /*MyEmployee Harry =new MyEmployee();
        Harry.setId(45);
        Harry.setName("Samarth");
        System.out.println(Harry.getId());
        System.out.println(Harry.getName());*/

        Circle a =new Circle();
        a.setRadius(3);
        a.setArea(28.26);
        a.setParameter(18.84);
        System.out.println(a.getRadius());
        System.out.println(a.getArea());
        System.out.println(a.getParameter());
        
    }
    
}
