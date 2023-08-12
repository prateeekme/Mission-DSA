/**
 * The PalindromeInteger class checks if an input integer is a palindrome or not.
 */
import java.util.Scanner;

public class PalindromeInteger {

    static int reverseInteger, rem, inputIntegerCopy;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int inputInteger = scanner.nextInt();

            inputIntegerCopy = inputInteger;

            while (inputIntegerCopy != 0) {
                rem = inputIntegerCopy % 10;
                reverseInteger = (reverseInteger * 10) + rem;
                inputIntegerCopy /= 10;
            }
            System.out.println(reverseInteger);
        }

        if (inputIntegerCopy == reverseInteger) {
            System.out.println("The Integer is Palindrome ");
        } else {
            System.out.println("The Integer is not Palindrome ");
        }
    }
}