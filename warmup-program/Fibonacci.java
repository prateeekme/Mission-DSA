/**
 * The Fibonacci class calculates and prints the Fibonacci sequence up to a given count.
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int inputInteger = 0;

        System.out.println("Please enter the Fibonacci number count: ");
        try (Scanner scanner = new Scanner(System.in)) {
            inputInteger = scanner.nextInt();
        }
        
        for (int i = 0; i < inputInteger; i++) {
            int fibonacciNumber = getFibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    private static int getFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
