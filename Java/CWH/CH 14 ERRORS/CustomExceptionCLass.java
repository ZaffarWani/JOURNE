import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString()+ "I Am toString()";
    }@Override
    public String getMessage() {
        
        return super.getMessage()+" i am getiiing msg";
    }

}

public class CustomExceptionCLass {
    public static void main(String[] args) {
        int a ;
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        if(a<99){
            try{

                throw new MyException(); 
            }catch(Exception e){
             System.out.println(e.getMessage());   
            }
            
        }

    }
}
