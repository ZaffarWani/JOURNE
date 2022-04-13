import java.util.Scanner;

public class handlingError {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 8;
        marks[2] = 6;
        int an = new Scanner(System.in).nextInt();
        System.out.println("Enter num yu wanna divide with");
        int number = new Scanner(System.in).nextInt();
        try {
            System.out.println("The Value at array index is " + marks[an]);
            System.out.println("The value of array- value/num is " + marks[an] / number);

        } catch (ArithmeticException e) {
            // System.out.println("Some Exception Occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("Some Exception Occured");
            System.out.println(e);
        }
    }
}
