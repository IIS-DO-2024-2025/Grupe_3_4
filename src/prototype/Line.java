package prototype;

import java.awt.Color;
import java.awt.Graphics;

import mvc.Point;
import mvc.Shape;

public class Line extends Shape implements Cloneable {
	private Point startPoint;
	private Point endPoint;
	private Color color;
	
	public Line() {
	}

	public Line(Point startPoint, Point endPoint, Color color) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public Line clone() {
		try {
			return (Line) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
