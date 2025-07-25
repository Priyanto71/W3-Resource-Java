import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class Ex_47 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: "+sdf.format(System.currentTimeMillis()));
    }
}
