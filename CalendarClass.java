import java.util.Calendar;
import java.util.TimeZone;
public class CalendarClass {
    public static void main(String[] args) {
        //Calendar C = Calendar.getInstance();
        //System.out.println(C.getCalendarType());
        //System.out.println(C.getTimeZone());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
    
}
