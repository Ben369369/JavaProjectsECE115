package demos;

import external.StdDraw;

public class FuncPlotter {
	
	public static void main (String[] args) {
		
		int freq = 1;
		int N = 200;
		
		double[] x = new double[N];
		double[] y = new double[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = (double) i / N;
			y[i] = Math.sin(2 * Math.PI * freq * x[i]) + 
					0.1 * Math.sin(2 * Math.PI * 10 * freq * x[i]);
		}
		
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(-2.0,2.0);
		
		for (int i=0; i < N-1; i++)
			StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
	}
}

