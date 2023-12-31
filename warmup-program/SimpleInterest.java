/**
 * The above Java class calculates the simple interest based on the principal amount, time, and rate of
 * interest entered by the user.
 */
import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        
        int principal, time, rate;
        int result = 0;

        System.out.println("Enter the Principal Amount: ");
        try (Scanner scanner = new Scanner(System.in)) {
            principal = scanner.nextInt();

            System.out.println("Enter the time: ");
            time = scanner.nextInt();

            System.out.println("Enter the rate of interest: ");
            rate = scanner.nextInt();
        }
        result = principal*(1 + (time*rate));
        System.out.println("Amount: " + result);
    }
    
}
