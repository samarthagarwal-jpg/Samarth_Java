class MyThr1 extends java.lang.Thread
{
    public MyThr1(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=1;
        
        while (i<50) {
            System.out.println("Thankyou "+this.getName());
            //System.out.println("I am a thread");
            i++;
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("name1");
         MyThr1 t2 = new MyThr1("name2");
          MyThr1 t3 = new MyThr1("name3");
           MyThr1 t4 = new MyThr1("name4");
            MyThr1 t5 = new MyThr1("name5 (Most imp)");

            t1.setPriority(java.lang.Thread.MIN_PRIORITY);
            t2.setPriority(2);
            t3.setPriority(3);
            t4.setPriority(4);
            t5.setPriority(java.lang.Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

    }
    
}
