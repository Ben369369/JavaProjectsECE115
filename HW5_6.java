import java.util.Scanner;
public class HW5_6 {
    public static int NoOfVowels(String str){
        int no =0;
        for(int i =0;i<str.length();i++){
            char letter= str.charAt(i);
            if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ||
               letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U'){
                no++;
            }
        }return no;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = NoOfVowels(input);
        System.out.println("The number of vowels in the string is: " + vowelCount);
        scanner.close();
    }
}
