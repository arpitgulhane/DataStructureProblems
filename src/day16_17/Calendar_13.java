package day16_17;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class WeekDay {
    private String day;
    private String date;

    public WeekDay(String day, String date) {
        this.day = day;
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return day + " " + date;
    }
}

class Week {
    private Queue<WeekDay> days;

    public Week() {
        days = new LinkedList<WeekDay>();
    }

    public void addDay(WeekDay day) {
        days.add(day);
    }

    public Queue<WeekDay> getDays() {
        return days;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (WeekDay day : days) {
            sb.append(day.toString() + " ");
        }

        return sb.toString();
    }
}




public class Calendar_13 {
//    public class Calendar {
        public static void main(String[] args) {
            String args2[] =new String[5];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Month : ");
            args2[0] =scanner.nextLine();
            System.out.println("Enter Date");
            args2[1] =scanner.nextLine();

            int month = Integer.parseInt(args2[0]);
            int year = Integer.parseInt(args2[1]);

            // get the first day of the month
            LocalDate firstDay = LocalDate.of(year, month, 1);
            int dayOfWeek = firstDay.getDayOfWeek().getValue();

            // determine the number of days in the month
            int numDays = firstDay.lengthOfMonth();

            // create a queue of weeks to store the calendar
            Queue<Week> calendar = new LinkedList<Week>();
            Week currentWeek = new Week();

            // add empty days for the first week
            for (int i = 0; i < dayOfWeek; i++) {
                currentWeek.addDay(new WeekDay("", ""));
            }

            // add days for the rest of the month
            for (int i = 1; i <= numDays; i++) {
                LocalDate date = LocalDate.of(year, month, i);
                String day = date.getDayOfWeek().toString().substring(0, 2);
                currentWeek.addDay(new WeekDay(day, Integer.toString(i)));

                // start a new week if necessary
                if (date.getDayOfWeek().getValue() == 7) {
                    calendar.add(currentWeek);
                    currentWeek = new Week();
                }
            }

            // add empty days for the last week
            while (currentWeek.getDays().size() < 7) {
                currentWeek.addDay(new WeekDay("", ""));
            }
            calendar.add(currentWeek);

            // print the calendar
            System.out.printf("%10s %4d\n", firstDay.getMonth().toString(), year);
            System.out.println("-----------------------------");

            String[] daysOfWeek = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
            for (String day : daysOfWeek) {
                System.out.printf("%4s", day);
            }
            System.out.println();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            for (Week week : calendar) {
                for (WeekDay day : week.getDays()) {
                    System.out.printf("%4s", day.getDate());
                }
                System.out.println();
            }
        }
    }




//}
