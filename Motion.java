import external.StdDraw;
 import java.awt.Color;
public class Motion {

    private static final double G = 9.81; 
    private static final double DT = 0.05; 
    private static final double GROUND_LEVEL = 0.0;
 public static void main(String[] args) {
        double x0 = 10.0;
        double y0 = 50.0;

        double vx = 40.0;
        double vy = 50.0;

        StdDraw.setCanvasSize(800, 400);
        StdDraw.setXscale(0, 300);       
        StdDraw.setYscale(GROUND_LEVEL, 150); 
        
        double time = 0.0;
        double currentX = x0;
        double currentY = y0;
        double currentVy = vy;  
        
        while (currentY >= GROUND_LEVEL && (currentX >= 0) && (currentX <= 300)) {
            StdDraw.clear(StdDraw.WHITE);
            currentX = x0 + vx * time;
            currentY = y0 + currentVy * time - 0.5 * G * Math.pow(time, 2);
             currentVy = vy - G * time;
            
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledCircle(currentX, currentY, 1.5);
            StdDraw.show(); 
            StdDraw.pause((int) (DT * 1000)); 

            time += DT;
        }
    }
}