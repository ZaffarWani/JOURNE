interface Biscycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Biscycle{
    public void blowHorn(){
        System.out.println("pee pee poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up");
    }
    public void blowHorn1(){
        System.out.println("meow");
    }
    
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(3);
        ac.blowHorn();
        ac.blowHorn1();
    }
}
