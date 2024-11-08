package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point p1 = new Point(10, 10, Color.BLACK);
		
		// Testiranje dodavanja tačke
		// model.add(p);      ---> nemamo mogućnost kasnije implementacije undo/redo
		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		
		addPointCmd.execute();
		System.out.println(model.getShapes());
		
		addPointCmd.unexecute();
		System.out.println(model.getShapes());
		
		addPointCmd.execute();
		System.out.println(model.getShapes());
		
		// Testiranje brisanja tačke
		Command removePointCmd = new RemovePointCmd(model, p1);
		
		removePointCmd.execute();
		System.out.println(model.getShapes());
		
		removePointCmd.unexecute();
		System.out.println(model.getShapes());
		
		// Testiranje modifikacije
		Point p2 = new Point(20, 20, Color.BLACK);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		updatePointCmd.execute();
		//p1 = p2;
		System.out.println(p1);
		
		updatePointCmd.unexecute();
		System.out.println(p1);
		
		// LINIJA
		Point p3 = new Point(30, 30, Color.BLACK);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		Line l1 = new Line(p1, p2, Color.BLACK);
		Line l2 = new Line(p3, p4, Color.BLACK);
		
		AddLineCmd addLineCmd = new AddLineCmd(model, l1);
		addLineCmd.execute();
		System.out.println(model.getShapes());
		
		
		UpdateLineCmd updateLineCmd = new UpdateLineCmd(l1, l2);
		updateLineCmd.execute();
		System.out.println(model.getShapes());

	}

}
