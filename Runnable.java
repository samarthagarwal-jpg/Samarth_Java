class MyThreadRunnable1 implements java.lang.Runnable
{
    public void run()
    {
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");
        System.out.println("I am a thread1");

    }
}
class MyThreadRunnable2 implements java.lang.Runnable
{
    public void run()
    {
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        System.out.println("I am a thread2");
        
    }
}
public class Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        java.lang.Thread gun1 = new java.lang.Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        java.lang.Thread gun2 = new java.lang.Thread(bullet2);

        gun1.start();
        gun2.start();

        
    }
    
}
