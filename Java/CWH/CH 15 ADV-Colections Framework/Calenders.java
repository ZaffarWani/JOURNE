import java.time.LocalDateTime;
import java.util.Calendar;

public class Calenders {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getCalendarType());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(LocalDateTime.now());
    }    
}
