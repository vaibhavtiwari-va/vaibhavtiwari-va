import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98Calender {
    public static void main(String[] args) {
     //    Calendar c= Calendar.getInstance();
//System.out.println(c.getCalendarType());
       //  System.out.println(c.getTimeZone());
       Calendar c= Calendar.getInstance();
       System.out.println(c.getCalendarType());
               System.out.println(c.getWeekYear());
               System.out.println(c.getWeeksInWeekYear());
               System.out.println(c.getTime());
    }

}
