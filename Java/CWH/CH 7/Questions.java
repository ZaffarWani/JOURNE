
public class Questions {
    
    // Q1 multipilication table
    static void mul(int n){
        for(int i =1;i<=10;i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }

    }
    // Q2 * pattern

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Q3 sum of n no using recursion
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);

    }
    static int fib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {

        //Q1
        //  mul(7);

        // Q2
        //pattern1(9);
                
        // Q3
    //     int c =sumRec(3);
    //     System.out.println(c);
    // Q5
    // fibonacci series 0,1,1,2,3,4,8,13,21,34
        System.out.println(fib(7));
    }
       
}