import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
class time_API_and_methods
{
    public static void main(String[] args) {
        LocalDate d1= LocalDate.now();
         System.out.println(d1);
        LocalTime t1= LocalTime.now();
         System.out.println(t1);
         LocalDateTime dt=LocalDateTime.now();
         System.out.println(dt);
    }
}