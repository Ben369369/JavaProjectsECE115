import java.util.Scanner;

public class HW5_5 {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String original = scanner.nextLine();
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);
        scanner.close();
    }
}
