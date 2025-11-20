import java.util.Scanner;

public class collatzconjencture {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int x = keyboard.nextInt(); 
        while (x != 1&& x>0) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x+" , ");
        }
    }
}

