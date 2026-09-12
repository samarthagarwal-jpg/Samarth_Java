
interface Bicycle 
{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle
{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle
{
    int speed=60; 
    
    void blowHorn()
    {
        System.out.println("Pee pee poo poo");
    }

    public void applyBreak(int decrement)
    {
        System.out.println("Applying Break");
        speed=speed-decrement;
        System.out.println("Now speed is: "+speed);
    }

    public void speedUp(int increment)
    {
        System.out.println("Speeding");
        speed=speed-increment;
        System.out.println("Now speed is: "+speed);
        
    }

    public void blowHornK3g()
    {
        System.out.println("Kabhi Khushi Kabhi Gamm pee pee pee");
    }

    public void blowHornmhn()
    {
        System.out.println("Mai Hoon Naa po po po");
    }

}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle a1 =new AvonCycle();
        a1.applyBreak(10);
        //System.out.println(a1.a);  //you can properties in interfaces
        //a1.a=54;                 //you cannot modify the properties in interfaces
        

        a1.blowHornK3g();
        a1.blowHornmhn();
    }
    
}
