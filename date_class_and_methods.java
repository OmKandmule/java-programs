import java.util.Date;

public class date_class_and_methods {
      public static void main(String[] args) {

        Date d1 =new Date();
        System.out.println(d1);
        System.out.println(d1.getTime()+" time");
        System.out.println(d1.getDate()+" date");
        System.out.println(d1.getDay()+" day");
        System.out.println(d1.getHours()+" hours");
        System.out.println(d1.getMinutes()+" minutes");
        System.out.println(d1.getMonth()+" month");
        System.out.println(d1.getYear()+" year");

      }    
}
