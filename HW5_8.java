import java.util.Scanner;

public class HW5_8 {
    public static int sumNumbersInArray(int[]array){
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        if(array == null || array.length == 0){
            return 0;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers separated by space: ");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        scanner.close();

        int sum = sumNumbersInArray(numbers);
        System.out.println("Sum of the numbers in the array: " + sum);   
    }
}
