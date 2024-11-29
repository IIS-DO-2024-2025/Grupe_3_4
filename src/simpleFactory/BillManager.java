package simpleFactory;

public class BillManager {
	Bill bill;
	BillFactory billFactory;
	
	public BillManager(BillFactory billFactory) {
		this.billFactory = billFactory;
	}

	public void processBill(String type) {
		
		/* Motivacija za kreiranje simple factory klase
		if(type.equals("electricitiy"))
			bill = new ElectricityBill();
		else if(type.equals("gas"))
			bill = new GasBill();
		else if(type.equals("utility"))
			bill = new UtilityBill();*/
		
		bill = billFactory.createBill(type);
		bill.pay();
	}

}
