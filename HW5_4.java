import java.util.Scanner;

public class HW5_4 {
    public static int randomNumber(int minimum, int maximum){

        int number = (int)(Math.random() * (maximum - minimum + 1)) + minimum; 
        return number;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the minimum number: ");
        int minimum = keyboard.nextInt();
        System.out.println("Enter the maximum number: ");
        int maximum = keyboard.nextInt();
        keyboard.close();

        int randomNum = randomNumber(minimum, maximum);
        System.out.println("The random number between "+minimum+" and "+maximum+" is: "+randomNum);
    }
}
