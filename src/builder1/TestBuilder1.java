package builder1;

public class TestBuilder1 {

	public static void main(String[] args) {
		PizzaChef chef = new PizzaChef(new CapricciosaBuilder());
		Pizza pizza = chef.makePizza();
		
		System.out.println("Napravili smo: " + pizza);

	}

}
