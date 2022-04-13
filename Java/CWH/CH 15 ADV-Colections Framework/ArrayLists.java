import java.util.*; 

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(5);
        l2.add(120);
        l2.add(121);
        l2.add(122);
        l2.add(123);
        l2.add(13);

        l1.add(6);
        l1.add(1);
        l1.add(2);
        l1.add(7);
        l1.add(4);
        l1.add(3,6);
        l1.add(0,5);
        l1.addAll(l2);
        l1.remove(2);    
        l1.set(4, 69); 
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }    
}
// in array we cant add or remove items in between 
// arrarlist tackle tht prob