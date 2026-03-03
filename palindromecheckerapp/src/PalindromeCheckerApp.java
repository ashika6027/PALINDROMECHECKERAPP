import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = scanner.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("\"" + str + "\" is a PALINDROME");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome");
        }
        scanner.close();

    }
}