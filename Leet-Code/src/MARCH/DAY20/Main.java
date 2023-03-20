package MARCH.DAY20;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        System.out.println(day);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Display current Date and Time

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj);

        // Formatting Date and Time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting :" + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formmtting: " + formattedDate);

        System.out.println(1+3+ 'a');
    }
}
