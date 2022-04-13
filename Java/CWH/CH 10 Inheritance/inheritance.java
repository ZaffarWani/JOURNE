class Base{
    int x;
    public int getX(){
        return x;
    }public void setX(int x){
        System.out.println("I am in base and setting X now");
        this.x = x;
    }public void printMe(){
        System.out.println(" i am a constructor");
    }
    // Derived class
}class Derived extends Base{
    // extends is used to declare inheritance
    int y;
    public int getY(){
        return y;
    }public void setY(int y){
        this.y =y;

    }
}
 
public class inheritance{
    public static void main(String[] args) {
        // creating objest of base class
        Base b =new Base();
        b.setX(4);
        System.out.println("base = "+b.getX());
        // Creaing an object of derived class 
        Derived d = new Derived();
        d.setX(5);
        System.out.println("derived = "+d.getX());
        
    }
} 