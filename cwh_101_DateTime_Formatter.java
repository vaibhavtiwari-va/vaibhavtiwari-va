import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.now();
        System.out.println(d);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("DD-MM-YYYY-- E H:m a");
        DateTimeFormatter dt2= DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dt);

        String mydate= dt.format(d);
        System.out.println(mydate);
    }

}
