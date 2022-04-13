class MyThreadRunnable implements Runnable{
    public void run(){
        while(true){
            
            System.out.println("         I Am Not A Thread MTR");
        }
    } 
}
class MyThreadRunnable1 implements Runnable{
    public void run(){
        while(true){

            System.out.println("I Am Not A Thread MTR2");
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable bullet1= new MyThreadRunnable();
        Thread gun1 = new  Thread(bullet1);
        MyThreadRunnable1 bullet2 = new MyThreadRunnable1();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }    
}
