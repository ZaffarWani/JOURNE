// By Extedning Thread Class
// Method 1

class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <10){

            System.out.println("MY Thread Is Running");
            System.out.println("I Am Happy");
            i++;
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<10){

            System.out.println("MY Thread1 Is Running");
            System.out.println("I Am Sad");
            i++;
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }    
}
