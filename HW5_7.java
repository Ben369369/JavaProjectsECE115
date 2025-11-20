import java.util.Scanner;

public class HW5_7 {
    public static String[] sortThree(String name1, String name2,String name3){
        //function to sort out inputed names in alphabetical order using .compareTo() method
        String[] names = {name1, name2, name3};
       for (int i = 0; i < names.length; i++) {
          
            for (int j = i + 1; j < names.length; j++) {
              
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
            }
        }
    }return names;
    }public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter the second name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter the third name: ");
        String name3 = scanner.nextLine();

        String[] sortedNames = sortThree(name1, name2, name3);
        System.out.println("Names in alphabetical order:");
        for(String name: sortedNames){
            System.out.println(name);
        }
    }}

