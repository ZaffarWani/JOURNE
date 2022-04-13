import javax.sound.sampled.SourceDataLine;

interface DemoAno{
    void meth1();
    void meth2();
    }

    
class AnonyDemo implements DemoAno {
    public void display(){
        System.out.println("hello");
        }
    @Override
    public void meth1(){
        System.out.println("mth1");
    }
    @Override
    public void meth2(){}
}

public class lambda{
    public static void main(String[] args) {
        AnonyDemo obj = new AnonyDemo();
        obj.meth1();

    }
}
    

