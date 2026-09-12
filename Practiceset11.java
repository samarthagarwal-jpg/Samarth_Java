abstract class Pen
{
    abstract public void write();
    abstract public void reFill();
}
class butterFlow extends Pen
{
    public void changeNib()
    {
        System.out.println("Changing nib...");
    }
    @Override
    public void write()
    {
        System.out.println("Writing...");
    }
    @Override
    public void reFill()
    {
        System.out.println("Refilling...");
    }
}

class Monkey
{
    public void jump()
    {
        System.out.println("Monkey is jumping");
    }
    public void bite()
    {
        System.out.println("Monkey is biting");
    }
}
interface BasicAnimal
{
     public void Eat();
     public void Sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void Speak()
    {
        System.out.println("Hello Sir..");
    }
    public void Eat()
    {
        System.out.println("Eating...");
    }
    public void Sleep()
    {
        System.out.println("Sleeping...");
    }
}

abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone2 extends TelePhone
{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void lift()
    {
        System.out.println("Lift...");
    }
    public void disconnect()
    {
        System.out.println("Disconnect...");
    }

    public void clickSnap()
    {
        System.out.println("Clicking a snap...");
    }
    public void recordingVideo()
    {
        System.out.println("Recording a vedio...");
    }

}

public class Practiceset11 {
    public static void main(String[] args) {
        //1
        /*butterFlow bf = new butterFlow();
        bf.changeNib();
        bf.write();
        bf.reFill();*/

        //3
        /*Human h = new Human();
        h.Speak();
        h.Eat();
        h.Sleep();
        h.jump();
        h.bite();*/

        //4
        /*TelePhone tp = new SmartPhone2();
        tp.disconnect();
        //tp.clickSnap(); //error */
    }
    
}
