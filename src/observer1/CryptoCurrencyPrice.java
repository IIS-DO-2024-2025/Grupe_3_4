package observer1;

import java.util.ArrayList;
import java.util.Iterator;

public class CryptoCurrencyPrice implements Observable {
	private double bitcoinPrice;
	private double etherPrice;
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext())
			it.next().update(bitcoinPrice, etherPrice);
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
		notifyObservers();
	}
	
	

}
