package day16_17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class Calendar {
        public static void main(String[] args) {
            String args2[] =new String[5];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Month : ");
            args2[0] =scanner.nextLine();
            System.out.println("Enter Date");
            args2[1] =scanner.nextLine();
            if (args.length != 2) {
                System.out.println("Usage: java Calendar <month> <year>");
                return;
            }


            int month = Integer.parseInt(args2[0]);
            int year = Integer.parseInt(args2[1]);

            // get the first day of the month
            LocalDate firstDay = LocalDate.of(year, month, 1);
            DayOfWeek dayOfWeek = firstDay.getDayOfWeek();

            // determine the number of days in the month
            int numDays = YearMonth.of(year, month).lengthOfMonth();

            // create a 2D array to store the calendar
            int[][] calendar = new int[6][7];

            // populate the calendar with the dates
            int row = 0;
            int col = dayOfWeek.getValue() % 7;

            for (int i = 1; i <= numDays; i++) {
                calendar[row][col] = i;
                col++;

                if (col == 7) {
                    row++;
                    col = 0;
                }
            }

            // print the calendar
            String[] daysOfWeek = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

            System.out.printf("%10s %4d\n", Month.of(month).name(), year);
            System.out.println("-----------------------------");

            for (int i = 0; i < 7; i++) {
                System.out.printf("%4s", daysOfWeek[i]);
            }
            System.out.println();

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    if (calendar[i][j] == 0) {
                        System.out.printf("%4s", " ");
                    } else {
                        System.out.printf("%4d", calendar[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
