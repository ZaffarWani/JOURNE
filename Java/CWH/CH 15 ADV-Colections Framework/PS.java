import java.util.*;

public class PS {
     public static void main(String[] args) {
         
        // create array list of 10 students
        ArrayList ar = new ArrayList();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");
        ar.add("Student11");
        for(Object o:ar){
            System.out.println(o);
        }

        // PS Q5
        // Set s = new HashSet<>();
        // s.add(5);
        // s.add(56);
        // s.add(51);
        // s.add(60);
        // s.add(5);
        // System.out.println(s);
        // PS Q2
        Date d = new Date();
        System.out.println(d.getHours()+"H " +d.getMinutes()+ "M "+d.getSeconds()+"S");
        
    }
}
