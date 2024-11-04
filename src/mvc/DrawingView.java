package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	
	// izuzetak od nase MVC arhitekture
	private DrawingModel model = new DrawingModel();

	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
	public void paint(Graphics g) {
		Iterator<Point> it = model.getShapes().iterator();
		while(it.hasNext())
			it.next().draw(g);
	}
	

}
