/**
 * The ArmstrongNumber class checks if a given integer is an Armstrong number or not.
 */
import java.util.Scanner;

public class ArmstrongNumber {

    static int rem, count, copyInt;
    static int resultant = 0;

    public static void main(String[] args) {

        System.out.println("Enter your Integer: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int inputInteger = scanner.nextInt();
            copyInt = inputInteger;

            while (inputInteger != 0) {
                inputInteger /= 10;
                count++;
            }

            while (copyInt != 0) {

                rem = copyInt % 10;
                resultant += Math.pow(rem, count);
                copyInt /= 10;

            }
        }

        if (copyInt == resultant) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("It's not a Armstrong Number");

        }

    }

}