import java.util.Scanner;

public class Practiceset4 {
    public static void main(final String[] args) {
        
        //1

          /*Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Marks of Student in exam!");
          System.out.println("Enter the marks of Maths (--/100)");
          float maths = sc.nextFloat();
          System.out.println("Enter the marks of English (--/100)");
          float eng = sc.nextFloat();
          System.out.println("Enter the marks of Hindi (--/100)");
          float hindi = sc.nextFloat();

          float per = (maths+eng+hindi)/3;
         
          if(per>=40 && maths>=33 && eng>=33 && hindi>=33 ){

            System.out.println("Student is PASSED");
          }
          else
          {
            System.out.println("Student is FAILED");
          }

          System.out.printf("The Total percentage is %f",per);*/
        
          //2
        
          /*Scanner sc = new Scanner(System.in);
          System.out.println("Enter Your Income: ");
          float income= sc.nextFloat();

          
          if(income>=250000 && income<500000)
          {
            float tax1=(5*income)/100;
            System.out.printf("The total tax you pay on the income %.2f is %.2f",income,tax1);
          }
           else if(income>=500000 && income<1000000)
          {
            float tax2=(20*income)/100;
            System.out.printf("The total tax you pay on the income %.2f is %.2f",income,tax2);
          }
           else if(income>=1000000)
          {
            float tax3=(30*income)/100;
            System.out.printf("The total tax you pay on the income %.2f is %.2f",income,tax3);
          }
          else
          {
            System.out.println("There is NO tax on income less than 2.5lakhs");
          }*/

        //3

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of day");
        int day= sc.nextInt();
        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturady");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Inavlid Input!");
        }*/

    //4

    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year: ");
    int year = sc.nextInt();
    if(year%4==0&&year%100!=0||year%400==0)
    {
      System.out.println("The year is leap year");
    }
    else{
      System.out.println("The is not a leap year");
    }*/
    

      //5
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the website name: ");
      String web = sc.next();

      
      if(web.endsWith(".org"))
      {
        System.out.println("Its a organigation website!");
        
      }
      else if(web.endsWith(".com"))
      {
        System.out.println("Its a commercial website!");
        
      }
      else if(web.endsWith(".in"))
      {
        System.out.println("Its a indian website!");
        
      }
      else
      {
        System.out.println("Not recongnised");
      }
      sc.close();
    }
    
}
