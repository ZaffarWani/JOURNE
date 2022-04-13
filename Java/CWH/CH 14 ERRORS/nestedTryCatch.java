import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=7;
        marks[1]=8;
        marks[2]=9;
       Scanner in = new Scanner(System.in);
        
        boolean flag = true;
        while(flag){
            int ind = in.nextInt();
            try{
                System.out.println("Welcome to Video 82");
                try{
                    System.out.println(marks[ind]);
                    flag=false;
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry DOesnt exist");
                    System.out.println("Level 2");
                }
            }
            catch(Exception e ){
                System.out.println("exception level 1");
            }
        }System.out.println("Exited");
    }
}  
