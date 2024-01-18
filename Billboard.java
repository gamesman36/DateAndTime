import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Billboard {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("After formatting: " + formattedDate);
        String dayOfWeek = currentDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Happy " + dayOfWeek);
        int weekNumber = currentDateTime.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
        System.out.println("It is week " + weekNumber);
    }
}
