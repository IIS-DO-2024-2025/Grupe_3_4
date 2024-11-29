package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		
		/* ------------ Testiranje shallow clone načina ---------- */
		
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		Line line = new Line(p1, p2, Color.BLACK);

		Line lineClone = line.clone();
		
		System.out.println(line);
		System.out.println(lineClone);
		
		line.getStartPoint().setX(500);
		System.out.println(lineClone.getStartPoint().getX()); // ----> 500
		
		
		/* ------------ Testiranje deep clone načina ----------*/
		
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		LineDeep lineDeep = new LineDeep(p3, p4, Color.BLACK);
		LineDeep lineDeepClone = lineDeep.clone();
		
		lineDeep.getStartPoint().setX(700);
		System.out.println(lineDeepClone.getStartPoint().getX()); // ---> 30
	}

}
