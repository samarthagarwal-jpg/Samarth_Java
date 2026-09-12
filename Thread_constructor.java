class MyThrRunnable implements java.lang.Runnable
{
    private String name;
    public MyThrRunnable(String nm)
    {
        this.name=nm;
        
    }
    public void run()
    {
        System.out.println("I am runnable thread");
        System.out.println("I am runnable thread");
        System.out.println("I am runnable thread");
        System.out.println("I am runnable thread");
        System.out.println("I am runnable thread");
    }
}
class MyThr extends java.lang.Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Thankyou");
        /*while (true) {
            System.out.println("I am a thread");
            
        }*/
    }
}
public class Thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Samarth");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is "+ t1.getId());
        System.out.println("The name of the thread is "+ t1.getName());
        System.out.println("The id of the thread is "+ t2.getId());
        System.out.println("The name of the thread is "+ t2.getName());

        /*MyThrRunnable t3 = new MyThrRunnable("Sam");
        java.lang.Thread thr = new java.lang.Thread(t3,"Sam");
        thr.start();
        System.out.println(thr.getName());*/
    }
    
};