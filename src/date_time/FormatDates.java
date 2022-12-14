package date_time;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("\n-----Formatting Date-----\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:34:27 CST 2022


        // Print the date  in the format of MM/dd/yyyy  -- 12/11/2022
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date)); // 12/11/2022

        // Print the date in the format of yyyy -- 2022

        formatter = new SimpleDateFormat("yyyy");
        System.out.println(formatter.format(date)); // 2022

       // System.out.println(new SimpleDateFormat("yyyy").format(new Date())); // 2022
       System.out.println(new SimpleDateFormat("hh, 'o', a, z").format(new Date())); // 2022





    }
}
