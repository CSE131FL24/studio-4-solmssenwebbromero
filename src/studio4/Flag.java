package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color pinky = new Color(255,180,222);
		
		StdDraw.setPenColor(pinky);
		StdDraw.filledRectangle(.5,.5,.5,.3);
		
		Color purply = new Color(224,181,255);
		StdDraw.setPenColor(purply);
		StdDraw.filledRectangle(.25, .65, .25, .15);
		StdDraw.filledRectangle(.75, .35, .25, .15);
		
		Color greeny = new Color(206,242,143);
		StdDraw.setPenColor(greeny);
		StdDraw.filledCircle(.5, .5, .3);
		
		
		double [] coordsx = {.276,.5,.724};
		double [] coordsy = {.3,.8,.3};
		StdDraw.setPenColor(pinky);
		StdDraw.filledPolygon(coordsx, coordsy);	
		
		double [] coordsx2 = {.385,.5,.615};
		double [] coordsy2 = {.55,.3,.55};
		StdDraw.setPenColor(purply);
		StdDraw.filledPolygon(coordsx2, coordsy2);
		
	}
}