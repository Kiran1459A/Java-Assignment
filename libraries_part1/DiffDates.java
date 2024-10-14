//26. Write a program to accept starting_date and ending_date in DD-MM-YYYY format and display no of days between those two dates.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiffDates {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String date1=sc.nextLine();
    LocalDate start=LocalDate.parse(date1);
    String date2=sc.nextLine();
    LocalDate End=LocalDate.parse(date2);
    System.out.println(ChronoUnit.DAYS.between(start, End));
   }
}
