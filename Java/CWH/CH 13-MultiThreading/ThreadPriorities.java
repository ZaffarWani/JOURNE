class MyThr extends Thread{
    public MyThr (String name){
        super(name);
    }
    
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thank you " + this.getName());   
            i++;
        }
        }

}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("zaffar");
        MyThr t2 = new MyThr("aalim");
        MyThr t3 = new MyThr("maq");
        MyThr t4 = new MyThr("sam (most imprtant) ");
        MyThr t5 = new MyThr("harry");
        // setting periority
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);//default 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    
}
