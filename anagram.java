import java.util.*;
import java.util.Scanner;  
class Solution {
    public List<String> removeAnagrams(String[] words) {

        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }
        return removeAnagrams(Arrays.asList(words));
    }

    public static List<String> removeAnagrams(List<String> words) {
        List<String> result = new ArrayList<>();
        String prevSorted = "";
        
        for (String word : words) {
            if (word == null) continue;
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            // Only compare with previous word's sorted version
            if (!sortedWord.equals(prevSorted)) {
                result.add(word);
                prevSorted = sortedWord;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        List<String> words = Arrays.asList(input.split(" "));
        List<String> uniqueWords = removeAnagrams(words);

        System.out.println("List after removing anagrams: " + uniqueWords);
    }
}