import java.util.*;

public class DateAndTime {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/1000/3600/24);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }    
}
 