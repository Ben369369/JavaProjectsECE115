import java.util.Scanner;

public class randomnumbergenerator {
    public static void main(String[] args) {
        
        int[] randomNumbers = new int[5];

        for (int i = 0; i < 5; i++) {
            int number = (int)(Math.random() * (39 - 21 + 1)) + 21; 
            randomNumbers[i] = number;
            
        }
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int x = keyboard.nextInt();
        keyboard.close();
        
        boolean isInArray = false;
        for (int num : randomNumbers) {
        if (num == x) {
            isInArray = true;
            System.out.println(x + " is in the array.");
             break;}
        else{
            System.out.println(x + " is not in the array.");
            break;
           
        }
    }
    
        
    }
}
