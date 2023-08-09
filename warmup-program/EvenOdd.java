import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        int num;

        System.out.println("Enter any Integer number: ");

        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }
        if(num % 2 ==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
    }
}33