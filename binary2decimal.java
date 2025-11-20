import java.util.Scanner;

public class binary2decimal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter 4 digit binary number:");
       String binaryNumber = scanner.nextLine();

       String[] bits = binaryNumber.split("");
       String bit4 = bits[0];
       String bit3 = bits[1];
       String bit2 = bits[2];
       String bit1 = bits[3];

       int decimalValue = Integer.parseInt(bit4) * 8 + Integer.parseInt(bit3) * 4 + Integer.parseInt(bit2) * 2 + Integer.parseInt(bit1) * 1;
       System.out.println("The decimal value is: " + decimalValue);
   }
}
