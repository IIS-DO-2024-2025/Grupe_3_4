package strategy;

public class PensionersDiscount implements DiscountStrategy {

	@Override
	public double calculatedDiscount(double amount) {
		return amount * 0.25; // 25% popusta
	}

}
