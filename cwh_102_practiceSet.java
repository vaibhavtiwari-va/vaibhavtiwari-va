
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_practiceSet {
    
    public static void main(String[] args) {
        //ps 01
        ArrayList ar=new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);
        }
       //ps 02
       Date d= new Date();
       System.out.println(d.getHours()+":"+d.getMinutes()+":"+ d.getSeconds());
        //ps 03
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+ c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));
        
        //ps 05
        HashSet q=new HashSet<>();
        q.add(5);
        q.add(67);
        q.add(7);
        q.add(45);
        q.add(34);
        System.out.println(q);

    }

}
