package day16_17;

import java.util.Scanner;

public class FindYourNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of N from the command line argument
        String args2[]=new String[6];
        int N = Integer.parseInt(args2[0]);

        // Calculate the number of questions required to guess the number
        int n = (int) (Math.log(N) / Math.log(2));

        // Initialize the low and high values for the binary search
        int low = 0;
        int high = N - 1;

        // Recursively ask true/false if the number is between the high and low value
        for (int i = 0; i < n; i++) {
            int mid = (low + high) / 2;
            System.out.println("Is the number between " + low + " and " + mid + " ?");
            boolean answer = scanner.nextBoolean();
            if (answer) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Print the final answer
        System.out.println("The number you were thinking of is " + low);
    }

}
