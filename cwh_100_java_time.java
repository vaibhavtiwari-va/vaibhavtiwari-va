import java.lang.reflect.AccessFlag.Location;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class cwh_100_java_time {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t= LocalTime.now();
        System.out.println(t);

        LocalDateTime u = LocalDateTime.now();
        System.out.println(u);

        
    }

}