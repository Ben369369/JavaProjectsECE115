import java.util.Scanner;

public class HW5_10 {
        public static void towerOfHanoi(int n, int start, int end){
        if(n==1){
            seq(start,end);
        }else{
            int other=6-(start+end);
            towerOfHanoi(n-1,start,other);
            seq(start,end);
            towerOfHanoi(n-1,other,end);
        }
    }
    public static void seq(int start, int end){
        System.out.println("Move disk from rod "+start+" to rod "+end);
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n = scanner.nextInt();
        scanner.close();
        towerOfHanoi(n,1,3);
    }
 

}
