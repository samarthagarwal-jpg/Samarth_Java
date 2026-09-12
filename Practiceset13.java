class Practice13a extends java.lang.Thread
{
    public void run()
    {
        int i=1;
        
        while (i<5) {
            System.out.println("Good Morning.");
            i++;
        }
    }
}
class Practice13b extends java.lang.Thread
{
    public void run()
    {
        int i=1;
        
        while (i<100) {
            try {
                java.lang.Thread.sleep(200);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome.");
            i++;
        }
    }
}
public class Practiceset13 {
    public static void main(String[] args) {
        Practice13a p1 = new Practice13a();
        Practice13b p2 = new Practice13b();
        p1.setPriority(10);
        p2.setPriority(1);
        System.out.println("Priority of thread p1 is: " + p1.getPriority());
        System.out.println("Priority of thread p2 is: " + p2.getPriority());
        System.out.println("State of thread p1 is: " + p1.getState());
        System.out.println("State of thread p2 is: " + p2.getState());

        // p2.start();
        p1.start();
         System.out.println("State of thread p1 is: " + p1.getState());
         System.out.println("State of current thread is: " + java.lang.Thread.currentThread().getState());
        
    }
    
}
