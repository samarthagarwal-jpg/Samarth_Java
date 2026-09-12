class MyNewThr1 extends java.lang.Thread
{
    public MyNewThr1(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=1;
        
        while (i<100) {
            System.out.println("Thankyou "+this.getName());
            try {
                java.lang.Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends java.lang.Thread
{
    
    public void run()
    {
        int i=1;
        
        while (i<100) {
            System.out.println("Thankyou Sir");
            i++;
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1("SAM");
        MyNewThr2 t2 = new MyNewThr2();

        t1.start();
        /*try{
            t1.join();
        }
        catch(Exception error){
            System.out.println(error);

        } */  
        t2.start();
        
    }
    
}
