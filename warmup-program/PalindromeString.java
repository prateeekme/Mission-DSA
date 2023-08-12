import javax.swing.JOptionPane;

public class PalindromeSring {
    public static void main(String[] args) {
        String inputPalindrome = JOptionPane.showInputDialog("Please enter a palindrome:");
        String resultantString = "";

        int inputPalindromeLength = inputPalindrome.length();

        for(int i = (inputPalindromeLength-1); i>=0; i--){
            resultantString = resultantString + inputPalindrome.charAt(i);
        }

        if((resultantString.toLowerCase()).equals(inputPalindrome.toLowerCase())){
            System.out.println("Strings are Palindrome");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
