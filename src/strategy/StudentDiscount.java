package strategy;

public class StudentDiscount implements DiscountStrategy {

	@Override
	public double calculatedDiscount(double amount) {
		return amount * 0.1; // 10% popusta
	}

}
