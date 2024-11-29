package factoryMethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		ConcreteBillManager concreteBillManager = new ConcreteBillManager();
		concreteBillManager.processBill("utility");

	}

}
