import java.util.Scanner;
public class dayofweek {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int no = keyboard.nextInt();

        switch(no){
            case 1:{
                System.out.println("The day is Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("The day is Wednesday");
                break;
            }
            case 4:{
                System.out.println("The day is Thursday");
                break;
            }
            case 5:{
                System.out.println("The day is Friday");
                break;
            }
            case 6:{
                System.out.println("The day is Saturday");
                break;
            }
            case 7:{
                System.out.println("The day is 8Sunday");
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }

    }
}
    

