abstract class Base{
    public Base(){
        System.out.println("Base constructor");
    }
    public void hello(){
        System.out.println("Hello");
    }abstract public void greet();
}
class derived extends Base{
    @Override  
    public void greet(){
        System.out.println("good morning");
    
    }
abstract class greet1{
    public void greet(){
        
        System.out.println("good afternoon");
    }
}
}
public class Abstract {
    public static void main(String[] args) {
         
    }
}
 