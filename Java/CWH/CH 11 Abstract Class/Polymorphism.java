interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("piking");
    }

}
class SmartCellPhone extends CellPhone implements Wifi,Camera {
    public void takeSnap(){
        System.out.println("Taking Snap");
    } 
    public void recordVideo(){
        System.out.println("Recording");
    }
    public String[] getNetwork(){
        System.out.println("Searching");
        String[] networkList ={"Rider","Dlink", "lenovo"};
        return networkList;

    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to"+ network);
    }

}
public class Polymorphism {
   public static void main(String[] args) {
       Camera cam = new SmartCellPhone(); //this time we are using smartphone
       // as a camera that is why only those methods will work which are 
       // present in Camera

       // cam.getNetwork(); // not allowed
       cam.record4KVideo();
    } 
}
