class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<10){

            System.out.println(" i am a thread");
            i ++;
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("zaffar");
        t.start();
    System.out.println("the id of thread is" + t.getId());
    System.out.println("THe NAME of thread t is " + t.getName());
    }

}
