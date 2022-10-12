package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(400, 400);
		//StdDraw.setPenColor(0, 250, 0);
		//StdDraw.filledRectangle(0,0.5,0.5,0.3);
		StdDraw.setPenColor((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));
		//StdDraw.filledCircle(0.25, 0.5, 0.1);
		double[] xArr = new double[10];
		double[] yArr = new double[10];
		for (int i = 0; i<10; i++) {
			xArr[i] = Math.random();
			yArr[i] = Math.random();
		}
		StdDraw.filledPolygon(xArr, yArr);
	}
}