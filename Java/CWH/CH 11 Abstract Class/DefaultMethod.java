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
    // @Override
    // public void record4KVideo(){
    //     System.out.println("Overided 4K");
    // }
}

public class DefaultMethod {
    public static void main(String[] args) {
        SmartCellPhone ms = new SmartCellPhone();
        ms.record4KVideo();
        String[] ar=ms.getNetwork();   
        for(String item:ar){
            System.out.println(item);
        }
        
    
    }
}
