import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class arrays {
    public static void main(String[] args) {
       /**Arrays must be contigous therefore the cons of arrays is that you cannot change their size once created.and it is hard to add a new
        element in a specified index since you have to move the other elements to accomodate the addition, similarly for deletion of an 
        element you have to move the other elements to fill the gap created to maintain contiguity.
        example of an array declaration and initialization:
        int[] numbers= new int[7];  the size of the array is 7, the new keyword is used to allocate memory for the array that will hold 7 integers
         thus the CPU must allocate a contiguous block of memory that can hold 7 int thus 4B*7=28B of memory will be allocated since an int takes 4B of memory)
        another way of declaring and initializing an array is:
        int[] pressure;
        pressure = new int[100];(pressure is the reference variable that holds the address of the first element of the array in memory)
       */
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the expected size of temperature data:");
int size = keyboard.nextInt();
double[] temperature = new double[size];
keyboard.close();
temperature[1] = 36.5;
System.out.print(Arrays.toString(temperature));
//array initialization using for loop
int[] count = new int[100];
for(int i=0;i<100;i++){
    count[i]=(int)(Math.random()*100);
}
System.out.println(Arrays.toString(count));
    }
}