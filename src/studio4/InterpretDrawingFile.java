package studio4;

import java.io.File;
import java.awt.Color;
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
		int[] redComponent = {in.nextInt(), in.nextInt(), in.nextInt()};
		boolean isFilled = in.nextBoolean();
		double[] parameters = {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()};
		
		Color fileColor = new Color(redComponent[0], redComponent[1], redComponent[2]);
		StdDraw.setPenColor();
		
		if(shapeType.equals("rectangle")) {
		
			if(isFilled == true) {
				StdDraw.filledRectangle(parameters[0], parameters[1], parameters[2], parameters[3]);
			}else {
				
				StdDraw.rectangle(parameters[0], parameters[1], parameters[2], parameters[3]);
			}
		
		
		
		}
		
	}
}
