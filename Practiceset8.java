class Employee1
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name=n;
    }

}

class cellphone
{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("Vibrating...");
    }
    public void silent()
    {
        System.out.println("Silent...");
    }
}

class square
{
    int side;
    public void setSize(int n)
    {
        side=n;
    }

    public int size()
    {
        return side;
    }

    public int area()
    {
        return side*side;
    }

    public int para()
    {
        return 4*side;
    }
}
public class Practiceset8 {
    public static void main(String[] args) {

        //1
        /*Employee1 harry=new Employee1();
        harry.setName("codewithHarry");
        harry.salary=23;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary()); */

        //2
        /*cellphone nothing = new cellphone();
        nothing.ring();
        nothing.silent();
        nothing.vibrate();*/

        //3
        square sq=new square();
        sq.setSize(5);
        System.out.println("Side of Square: "+sq.size());
        System.out.println("Area of Square: "+sq.area());
        System.out.println("Parameter of Square: "+sq.para());

    }
}


