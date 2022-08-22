import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class FindDate{
            public static void main(String[] args) {
//                Calendar c = Calendar.getInstance();
//                System.out.println(c.getTimeZone().getID());
//                System.out.println(c.getFirstDayOfWeek());
                LocalDateTime d = LocalDateTime.now();
                LocalDate localDate = LocalDate.of(2012,2,2);
                System.out.println(d);
                DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String df = dt.format(d);
                System.out.println(df);

            }
        }