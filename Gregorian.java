import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();
        //System.out.println(c.getCalendarType());
        //System.out.println(c.getTimeZone().getID());
        //System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1); // Months are 0-based
        //System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));
        //System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        */

        GregorianCalendar g1 = new GregorianCalendar();
        System.out.println(g1.isLeapYear(2026));
        
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
