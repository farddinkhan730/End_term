import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_And_Time {
    public static void main(String[] args) {
        LocalDate obj=LocalDate.now();
        System.out.println(obj);
    }
}
class time{
    public static void main(String[] args) {
        LocalTime obj=LocalTime.of(1,54);
        System.out.println(obj);
    }
}
class dateandtime{
    public static void main(String[] args) {
        LocalDateTime obj=LocalDateTime.now();
        System.out.println(obj);
    }
}

//using date and time formatted
class formatted{
    public static void main(String[] args) {
        LocalDateTime obj1=LocalDateTime.now();
        DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String s=obj.format(obj1);
        System.out.println(s);
    }
}
