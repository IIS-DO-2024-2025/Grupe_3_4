package simpleFactory;

public class BillFactory {
	
	public Bill createBill(String type) {
		if(type.equals("electricitiy"))
			return new ElectricityBill();
		else if(type.equals("gas"))
			return new GasBill();
		else if(type.equals("utility"))
			return new UtilityBill();
		else
			return null;
	}
}
