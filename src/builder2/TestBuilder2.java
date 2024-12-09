package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integrelna kifla");
		
		builder.spread("pavlaka").spread("urnebes").meat("kulen").salad("zelena").spread("majonez");
		builder.spread("tzatziki");
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);
		

	}

}
