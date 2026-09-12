interface Camera
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
interface Wifi
{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone
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

class SmartPhone extends CellPhone implements Wifi,Camera
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
}
public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhone sp =new SmartPhone();
        String []ar =sp.getNetworks();
        for(String item :ar)
        {
            System.out.println(item);
        }
        sp.Record4kVedio();
        //sp.greet();     //error 
        
    }
    
}
