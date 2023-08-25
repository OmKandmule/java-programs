import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
       LocalDateTime dt=LocalDateTime.now();
       System.out.println(dt);        

       LocalTime t=LocalTime.now();
       System.out.println(t);          

       DateTimeFormatter df=DateTimeFormatter.ofPattern("dd//MM//yyyy : E");
       String format=dt.format(df);
       System.out.println(format);

       DateTimeFormatter df1=DateTimeFormatter.ofPattern("H::m::s  a");
       String format1=t.format(df1);
       System.out.println(format1);

       DateTimeFormatter df2=DateTimeFormatter.ofPattern("H::m::s :: E :: a");
       String format2=dt.format(df2);
       System.out.println(format2);
    }
    
}
