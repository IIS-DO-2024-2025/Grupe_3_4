package observer2;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();

		UpdateSMS service = new UpdateSMS();
		price.addObserver(service);
		
		price.setBitcoinPrice(25000);
		price.setEtherPrice(12300);

	}

}
