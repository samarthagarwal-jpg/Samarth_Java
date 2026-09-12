class NewEmployee
{
    private int id;
    private String name;
    private int salary;

    public NewEmployee()
    {
        id=4;
        name="Sam";
    }
   
    public NewEmployee(int n,String myName)
    {
        id=n;
        name=myName;
    }

    public NewEmployee(int n,String myName,int sal)
    {
        id=n;
        name=myName;
        salary=sal;
    }




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
    public void setSalary(int n)
    {
        salary=n;
    }
    public int getSalary()
    {
        return salary;
    }

}
public class Constructor {
    public static void main(String[] args) {
        //NewEmployee samarth = new NewEmployee(3,"Samarth");
        //NewEmployee samarth = new NewEmployee();
        NewEmployee samarth =new NewEmployee(3,"Samarth",30000);
        //samarth.setName("Samarth");
        //samarth.setId(12);
        System.out.println(samarth.getId());
        System.out.println(samarth.getName());
        System.out.println(samarth.getSalary());
        
    }
    
}
