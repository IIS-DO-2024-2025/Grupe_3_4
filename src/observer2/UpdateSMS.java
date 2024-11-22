package observer2;

import java.util.Observable;
import java.util.Observer;

public class UpdateSMS implements Observer {
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptoCurrencyPrice price = (CryptoCurrencyPrice) o;
		this.bitcoinPrice = price.getBitcoinPrice();
		this.etherPrice = price.getEtherPrice();
		
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New bitcoin price is: " + bitcoinPrice);
		System.out.println("New ether price is: " + etherPrice);
	}

}
