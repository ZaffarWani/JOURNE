
public class methordOverloading {
    // static void tellJoke(){
    //     System.out.println("I invented a new word!\n" +
    //     "Plagiarism");
    // }
    static void foo(){
        System.out.println("goood morning bro");

    }
    static void foo(int a){
        System.out.println("good "+ a + " bro ");
    }
 
    static void change(int a){
        a = 98;
    }
    static void change1(int[]arr){

        arr[0] = 98;
    }
    public static void main(String[] args) {
        //tellJoke();

        //int[] marks ={ 72,54,77,89,98,94};
        // case 1 changing the interger
        //int x = 45;
        //change (x);
        //System.out.println(x);

        // case II;changing the array
        //change1(marks);
        //System.out.println("value after change "+ marks[0]);
      //  methord overloading 
        foo();

        foo(3000);
    }
    
}


