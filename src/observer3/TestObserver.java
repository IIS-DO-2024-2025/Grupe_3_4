package observer3;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS service = new UpdateSMS();
		price.addListener(service);
		
		price.setBitcoinPrice(54000);
		price.setEtherPrice(33000);

	}

}
