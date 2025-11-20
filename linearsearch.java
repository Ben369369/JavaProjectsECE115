import java.util.Scanner;

public class linearsearch {
    public static int search(double[]numbers,double value){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==value){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        double[]numbers=new double[size];
        System.out.println("Enter the elements of the array as double values");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextDouble();
        }
        System.out.println("Enter the value to search for:");
        double value=scanner.nextDouble();
        int result= search(numbers,value);
        if(result==-1){
            System.out.println("Value not found in the array.");
        }
        else{
            System.out.println("Value found at index: "+result);
        }
    }
    
}
