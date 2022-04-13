import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1= new ArrayDeque<>();
        a1.add(6);
        a1.add(4);
        a1.add(3);
        a1.add(2);
        a1.addFirst(7);
        
        System.out.println(a1);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}
