import java.util.Scanner;

public class nvidia {
 
    public static void main(String[] args) {
        // Define the upper limit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit: ");
        int limit = scanner.nextInt();
        scanner.close();


        System.out.println("Ideal numbers of the form 3^x * 5^y less than " + limit + ":");
        for (int x = 0; ; x++) {
            int powerOf3 = (int) Math.pow(3, x);
            if (powerOf3 >= limit) break;
            for (int y = 0; ; y++) {
                int powerOf5 = (int) Math.pow(5, y);
                int idealNumber = powerOf3 * powerOf5;
                if (idealNumber >= limit) break;
                System.out.println(idealNumber);
            }
        }
    }
}
