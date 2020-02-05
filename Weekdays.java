import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Weekdays
{

    public static void main(String args[]){
        System.out.println(dayName("2015-03-05", "YYYY-MM-DD"));
    }

    public static String dayName(String inputDate, String format){
        Date date = null;
        try {
            date = new SimpleDateFormat(YYYY-MM-DD).parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }
}
