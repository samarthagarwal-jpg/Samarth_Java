interface Camera1
{
    void takeSnap();
    void RecordVedio();
    private void greet()
    {
        System.out.println("Good Morning...");
    }
    default void Record4kVedio()
    {
        greet();
        System.out.println("Recording in 4k");
    }
}
interface Wifi1
{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone1
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling..." + phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class SmartPhone1 extends CellPhone1 implements Wifi1,Camera1
{
      public void takeSnap()
      {
        System.out.println("Taking Snap...");
      }
      public void RecordVedio()
      {
        System.out.println("Recording Vedio...");
      }
      /*public void Record4kVedio()
      {
           System.out.println("Taking Snap & Recording in 4k...");
      }*/
      public String[] getNetworks()
      {
        System.out.println("Getting list of networks.");
        String[] networkList ={"Harry","Samarth","Adarsh"};
        return networkList;
      }
      public void connectToNetwork(String network)
      {
        System.out.println("Connecting to "+network);
      }

      public void sampleMeth()
      {
        System.out.println("meth");
      }
}
public class Polymorphism {
    public static void main(String[] args) {
        Camera1 cam = new SmartPhone1(); //this is a smart but use it as a camera

        cam.takeSnap(); 
        cam.Record4kVedio();
        //cam.getNetworks(); //not allowed
        //cam.sampleMeth(); //not allowed      
        
        SmartPhone1 sp1 = new SmartPhone1();
        sp1.sampleMeth();
        sp1.RecordVedio();
        
        String []ar =sp1.getNetworks();
        for(String item :ar)
        {
            System.out.println(item);
        }

        sp1.callNumber(7068);
    }
    
}
