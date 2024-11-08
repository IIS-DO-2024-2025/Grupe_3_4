package command;

import mvc.Point;

public class UpdatePointCmd implements Command {
	private Point point;
	private Point newState;
	private Point oldState = new Point();
	
	public UpdatePointCmd(Point point, Point newState) {
		this.point = point;
		this.newState = newState;
	}

	@Override
	public void execute() {
		//point = newState;
		//System.out.println(point);
		oldState.setX(point.getX());
		oldState.setY(point.getY());
		oldState.setColor(point.getColor());
		
		point.setX(newState.getX());
		point.setY(newState.getY());
		point.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		point.setX(oldState.getX());
		point.setY(oldState.getY());
		point.setColor(oldState.getColor());
	}

}
