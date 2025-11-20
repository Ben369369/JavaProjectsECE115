import java.util.*;

public class coordinateconverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter the value of x coordinate: ");
	    
	    double x = keyboard.nextDouble();
	    System.out.println("Enter the value of y coordinate: ");
		double y = keyboard.nextDouble();
		
		double r =Math.sqrt(x*x + y*y);
		double theta=0;
		if(x>0){
		    theta = Math.atan(y/x);}
		else{
		    theta = 180-Math.atan(y/x);}
		
		
         System.out.println("The polar coordinates are: theta= "+ theta + " r= "+r);  
        
    }
}
