import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calendar_current_methods {
    public static void main(String[] args) {
        Calendar c1 =Calendar.getInstance();
        System.out.println(c1.getTime());        
        System.out.println(c1.get(Calendar.YEAR));        
        System.out.println(c1.get(Calendar.MONTH));        
        System.out.println(c1.get(Calendar.DATE));        
        System.out.println(c1.get(Calendar.SECOND));        
        System.out.println(c1.get(Calendar.MINUTE));        
        System.out.println("current time = "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));        
        System.out.println(c1.getCalendarType());        
        GregorianCalendar cal =new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));

        for(int i =0 ;i<=1000;i++)
        {
            System.out.println(TimeZone.getAvailableIDs()[i]);
         }
    }
}
