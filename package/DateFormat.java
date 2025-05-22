//Use a utils package for date/time formatting and generating order numbers.

package utils;
import.java.time.LocalDataTime;
import.java.time.format.DateTimeFormatter;

public class DateFormat
{
public static String getCurrentDateTime()
{
LocalDateTime now=LocalDateTime.now();
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
return now.format(formatter);
}
}

