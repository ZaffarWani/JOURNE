class MyThr extends Thread {

    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("thank YOu");
            i++;
        }
    }
}

class MyThr1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("thank YOu 2");
            i++;
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        MyThr t2 = new MyThr();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(" ");
        }
        // to complete the first one first then execute next one
        t2.start();

    }
}
