package CH12Pakages;

import java.util.Scanner;

// Q1
class Calculator{
    public void calcu(int a, int b){
        System.out.println("result is = " + a+b);
    }
    public void scCalcu(int a , int b){
        System.out.println("result is "+ Math.sin(a+b));
    }
    public void hyCalcu(int a , int b){
        System.out.println("reult is "+ a+b);
        System.out.println("result is "+ Math.sin(a+b));
    }
}
// Q2
class scannner{
    public void input(){
        Scanner In = new Scanner(System.in);
        In.nextInt();
        System.out.println("this is input");
    }

}


public class questions{
    public static void main(String[] args) {
        // Q1
        System.out.println(" I Am Main Method");    
        
    
    }

    
}
 