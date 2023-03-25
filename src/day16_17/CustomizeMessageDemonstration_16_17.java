package day16_17;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomizeMessageDemonstration_16_17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName = sc.nextLine();
        System.out.println("Enter Last name");
        String LastName = sc.nextLine();
        System.out.println("Enter Number");
        String number = sc.nextLine();
        boolean Number2 = Pattern.matches("[91 ]+[0-9]{10}", "91 9284530926");
        System.out.println("Enter Date");
        String date = sc.nextLine();
        boolean date2 = Pattern.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", "09/06/1999");

        System.out.println("Read in the following message:\n Hello " +
                firstName +
                ", We have your full\nname as " +
                firstName+" "+LastName +
                "in our system. your contact number is" +
                number +
                "Please,let us know in case of any clarification Thank you BridgeLabz " +
                date);
    }
}
