package builder1;

public class SeafoodPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;
	
	public SeafoodPizzaBuilder() {
		pizza = new Pizza();
	}

	@Override
	public void putDough() {
		pizza.setDough("Integralno");
	}

	@Override
	public void putSauce() {
		pizza.setSauce("Paradajz sos");
	}

	@Override
	public void putCheese() {
		pizza.setCheese("Gauda");
	}

	@Override
	public void putMeat() {
		pizza.setMeat("Škampi");
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
