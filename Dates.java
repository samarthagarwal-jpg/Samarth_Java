import java.util.Date;
public class Dates{
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/1000/60);

        //System.out.println(Long.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());

        //old method
        Date d  = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth() + 1); // getMonth() returns months since January (0-11)
        System.out.println(d.getYear() + 1900); // getYear() returns years since 1900
    }
}