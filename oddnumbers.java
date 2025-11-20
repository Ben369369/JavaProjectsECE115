import java.util.Scanner;

public class oddnumbers {
        public static int[] oddNumbers(int l, int r) {
        int i;
        int oddNumberCount = 0;
        // First pass: count how many odd numbers are in the range
        for (i = l; i <= r; i++) {
            if (i % 2 != 0) {
                oddNumberCount++;
            }
        }
        // Allocate array with the exact size needed
        int[] odds = new int[oddNumberCount];
        int j = 0;
        // Second pass: fill the array with odd numbers
        for (i = l; i <= r; i++) {
            if (i % 2 != 0) {
                odds[j] = i;
                j++;
            }
        }
        return odds;
        

    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter lower bound number:");
        int l= keyboard.nextInt();
        System.out.println("Enter upper bound limit: ");
        int r= keyboard.nextInt();
        keyboard.close();
        int[]arrayOfOddNumbers=oddNumbers(l,r);

        for(int k=0;k<arrayOfOddNumbers.length;k++){
            System.out.println(arrayOfOddNumbers[k]);

        }
    }
}