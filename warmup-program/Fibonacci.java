import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        int inputInteger = 0;
        int result = 0;

        System.out.println("Please enter the Fibonacci number count: ");

        Scanner scanner = new Scanner(System.in);
        inputInteger = scanner.nextInt();

        if(inputInteger == 0){
            result = 0;
        }
        else{
            result += result;
        }

        System.out.println(result);

    }
    
}
