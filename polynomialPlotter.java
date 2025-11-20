 
import external.StdDraw; 
 
public class polynomialPlotter { 
   public static void plotPoly(int n, double[] coeffs, double xmin, double xmax) { 
       int samples = 800; // smoothness 
       double[] xs = new double[samples]; 
       double[] ys = new double[samples]; 
       double step = (xmax - xmin) / (samples - 1); 
       double ymin = Double.POSITIVE_INFINITY, ymax = Double.NEGATIVE_INFINITY; 
       for (int i = 0; i < samples; i++) { 
           double x = xmin + i * step; 
           xs[i] = x; 
           double y = coeffs[0]; 
           for (int j = 1; j <= n; j++) { 
               y = y * x + coeffs[j]; 
           } 
           ys[i] = y; 
           if (y < ymin) 
               ymin = y; 
           if (y > ymax) 
               ymax = y; 
       } 
 
       // Set drawing scale with a little margin 
       double xMargin = (xmax - xmin) * 0.05; 
       double yMargin = (ymax - ymin) * 0.1 + 1e-6; 
       StdDraw.setXscale(xmin - xMargin, xmax + xMargin); 
       StdDraw.setYscale(ymin - yMargin, ymax + yMargin); 
 
       // Draw axes 
       StdDraw.setPenRadius(0.002); 
       StdDraw.line(xmin - xMargin, 0, xmax + xMargin, 0); // x-axis 
       StdDraw.line(0, ymin - yMargin, 0, ymax + yMargin); // y-axis 
 
       // Draw curve by connecting sample points 
       StdDraw.setPenRadius(0.003); 
       for (int i = 0; i < samples - 1; i++) { 
           StdDraw.line(xs[i], ys[i], xs[i + 1], ys[i + 1]); 
       } 
   } 
 
   public static void main(String[] args) { 
       // a) constant y = 1 
       StdDraw.setPenColor(StdDraw.RED); 
       plotPoly(0, new double[] { 1.0 }, -1, 1); 
 
       StdDraw.setPenColor(StdDraw.BLUE); 
       // b) linear y = 2x + 1 
       plotPoly(1, new double[] { 2.0, 1.0 }, -1, 1); 
StdDraw.setPenColor(StdDraw.GREEN); 
// c) linear y = -3x + 0.5 
plotPoly(1, new double[] { -3.0, 0.5 }, -1, 1); 
StdDraw.setPenColor(StdDraw.ORANGE); 
// d) quadratic y = -x^2 + 1 
plotPoly(2, new double[] { -1.0, 0.0, 1.0 }, -1, 1); 
StdDraw.setPenColor(StdDraw.MAGENTA); 
// e) cubic y = x^3 + 0.1x - 0.1 
plotPoly(3, new double[] { 1.0, 0.0, 0.1, -0.1 }, -1, 1); 
} 
} 


