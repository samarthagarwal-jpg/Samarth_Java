class Employee {
        int id;
        String name;
        int salary;
        public void printDetails()
        {
            System.out.println("My id is "+ id);
            System.out.println("and My name is "+ name);
        }
        public int getSalary()
        {
            return salary;
        }
        
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This ous custom class");
        
        //instantiating a  new Employee object
        Employee harry= new Employee();  
        Employee samarth= new Employee();

        //setting attributes
        harry.id=12;
        harry.name="Harry";
        harry.salary=34;

        samarth.id=13;
        samarth.name="Samarth";
        samarth.salary=36;

        harry.printDetails();
                System.out.println(harry.getSalary());

        samarth.printDetails(); 
        

        //printing the attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);
    }
    
}
