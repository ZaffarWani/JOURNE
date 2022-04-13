public class variableArguments {

    // static int sum(int a ,int b){
    //     return a+b;
    // }
    // static int sum(int a ,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a ,int b,int c,int d){
    //     return a+b+c+d;
    // }
    // to increese no of arguments we have to add methord 
    //evrytime so we use variable arguments to tackle this prob
    static int sum(int ...arr){
        // available as int[] arr;
        int result = 0;
        for(int a:arr){
            result +=a;
        }return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to java");
        System.out.println("the sum of 4&5 is "+ sum(4, 5));
        System.out.println("the sum of 4&5,6 is "+ sum(4, 5,6));
        System.out.println("the sum of 4,5,6,7 is "+ sum(4, 5,6,7));
        
    }
    
}
