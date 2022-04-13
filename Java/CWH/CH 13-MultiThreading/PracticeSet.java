//Q1
class Practice extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Practice1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            // Q2 delay the execution for 300ms
            try{

                Thread.sleep(300);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}
 
public class PracticeSet {
    public static void main(String[] args) {
        //Q2 
        Practice p = new Practice();
        p.setPriority(6);
        p.start();
        Practice1 p1 =new Practice1();
        p1.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());
        p1.start();
    //Q3 set&get priority
    
    }

}
