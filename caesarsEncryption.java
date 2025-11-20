import java.util.Scanner;

public class caesarsEncryption {
    public static String encrypt(String plainText, int shiftKey){
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        plainText = plainText.toUpperCase();
        String cipherText = "";// Initialize cipher text as an empty string
        for(int i=0; i<plainText.length();i++){// Loop through each character in the plain text
            int charPosition=ALPHABET.indexOf(plainText.charAt(i));// Find the position of the character in the alphabet
            int keyVal=(shiftKey+charPosition)%26;// Calculate the new position with the shift key the modulus operator ensures it wraps around
            char replaceVal=ALPHABET.charAt(keyVal);// Get the character at the new position
            cipherText+=replaceVal;
        }
        return cipherText;// whitespace is interpreted as -1 in checking the charposition 
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the plain text: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter the shift key (number): ");
        int shiftKey = scanner.nextInt();
        String encryptedText = encrypt(plainText, shiftKey);
        System.out.println("Encrypted text: " + encryptedText);
        scanner.close();
    }
}
