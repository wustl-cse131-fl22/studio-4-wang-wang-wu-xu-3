package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeigh = in.nextDouble();
		double a = 0.0;
		double b = 0.0;
		if (in.hasNextDouble()) {
			a = in.nextDouble();
			b = in.nextDouble();
		}
		double[] xArr = {x,halfWidth,a};
		double[] yArr = {y,halfHeigh,b};
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		if (shapeType.equals("rectangle")) {
			if (isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
			} else {

				StdDraw.rectangle(x, y, halfWidth, halfHeigh);
			}
		}
		if (shapeType.equals("ellipse")) {
			if (isFilled) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeigh);
			} else {

				StdDraw.ellipse(x, y, halfWidth, halfHeigh);
			}
		}
		if (shapeType.equals("triangle")) {
			if (isFilled) {
				StdDraw.filledPolygon(xArr,yArr);
			} else {

				StdDraw.polygon(xArr,yArr);
			}
		}
	}
}
