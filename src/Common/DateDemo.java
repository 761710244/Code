package Common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void createDate() {
        Date date = new Date();
        System.out.println(date.toString());
    }

    public static void compareDate() {
        Date date1 = new Date(2020, 9, 26);
        Date date2 = new Date(2020, 9, 25);
        System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));
    }

    public static void DateFormat() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(date));
    }

    public static void main(String[] args) {
        createDate();
        compareDate();
        DateFormat();
    }
}
