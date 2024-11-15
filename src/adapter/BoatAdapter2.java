package adapter;

// 2. način - proširivanje
public class BoatAdapter2 extends Boat implements Vehicle {

	@Override
	public void goFaster() {
		rowFaster();
		
	}

}
