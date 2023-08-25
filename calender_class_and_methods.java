import java.util.Calendar;

class calender_class_and_methods
{
    public static void main(String[] args) {
      Calendar c1 = Calendar.getInstance();        
      System.out.println(c1.getCalendarType());
      System.out.println(c1.getTimeZone());
      System.out.println(c1.getTimeZone().getID());
      System.out.println(c1.getWeeksInWeekYear());
    }   
}