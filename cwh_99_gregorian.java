import java.security.GeneralSecurityException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class cwh_99_gregorian {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+";" +c.get(Calendar.MINUTE)+" ;" + c.get(Calendar.SECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        GeneralSecurityException d= new GeneralSecurityException();
        System.out.println(d.getLocalizedMessage());
        
    }

}
