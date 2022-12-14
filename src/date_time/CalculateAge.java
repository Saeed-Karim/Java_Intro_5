package date_time;

import utilities.ScannerHelper;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        /*
        Ask user to enter their age and find their year of birth

        CurrentYear - age
         */


//        int age = ScannerHelper.getAnAge();
//        System.out.println(LocalDate.now().getYear() - age);  // 2000
//
//        System.out.println(LocalDate.now().minusYears(age).getYear()); // 2000
//
//        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear()); // 2000


        /*
        Ask user to enter their year of birth

        Calculate their age

        currentYear  - year of birth
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date of year");

        int DateOfYear = scanner.nextInt();

        System.out.println(LocalDate.now().getYear() - DateOfYear);


    }
}
