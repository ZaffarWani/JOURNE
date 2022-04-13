import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer>  myHashSet = new HashSet<>(6,0.2f);
        myHashSet.add(4);
        myHashSet.add(2);
        myHashSet.add(5);
        myHashSet.add(3);
        myHashSet.add(1);
        myHashSet.add(1);
        System.out.println(myHashSet);
    
    }
}
