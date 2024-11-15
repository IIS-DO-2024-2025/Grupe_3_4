package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		/* Nije najbolja praksa, jer pravimo čvrstu vezu između TestAdapter klase i svake klase pojedinačno
		Car car = new Car();
		Plane plane = new Plane();
		Train train = new Train();
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat); */
		
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		
		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boatAdapter.goFaster();

	}

}
