/**
 * The GreetingName class prompts the user to enter their name and then prints a greeting message with
 * their name.
 */
import java.util.Scanner;

public class GreetingName {

    public static void main(String[] args) {
        
        String InputName;

        System.out.println("Enter your name: ");

        try (Scanner scanner = new Scanner(System.in)) {
            InputName = scanner.next();
        }
        System.out.println("Hello "+ InputName);
        
    }
    
}
