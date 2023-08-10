import java.util.Scanner;

public class FindLargeNumber {

    public static void main(String[] args) {
        
        int number1, number2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            number1 = scanner.nextInt();
            
            System.out.println("Enter second number: ");
            number2 = scanner.nextInt();
        }

        if(number1 > number2){
            System.out.println("First number is larger than Second");
        }else{
            System.out.println("Second number is larger than First");
        }

    }
    
}
