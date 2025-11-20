import java.util.Scanner;

public class decryptCaesar {
    public static String decrypt(String encryptedText) {
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder allDecryptions = new StringBuilder();// Store all possible decryptions
        
        //run through all possible shift keys from 1 to 25
        for (int shiftKey = 1; shiftKey < 26; shiftKey++) {
            StringBuilder decryptedText = new StringBuilder();// Store decrypted text for current shift keyu
            
            for (int i = 0; i < encryptedText.length(); i++) {
                int charPosition = ALPHABET.indexOf(encryptedText.charAt(i));
                int keyVal = (charPosition - shiftKey + 26) % 26;
                char replaceVal = ALPHABET.charAt(keyVal);
                decryptedText.append(replaceVal);
            }
            allDecryptions.append("Shift ").append(shiftKey).append(": ")
                         .append(decryptedText.toString()).append("\n");
        }
        return allDecryptions.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the encrypted text: ");
        String encryptedText = scanner.nextLine().toUpperCase();
        String result = decrypt(encryptedText);
        System.out.println("All possible decryptions:");
        System.out.println(result);
        scanner.close();
    }
}