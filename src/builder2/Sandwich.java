package builder2;

import java.util.ArrayList;

public class Sandwich {
	private String bread;
	private ArrayList<String> spreads;
	private ArrayList<String> meats;
	private ArrayList<String> salads;
	
//	public Sandwich(String bread, ArrayList<String> spreads, ArrayList<String> meats, ArrayList<String> salads) {
//		this.bread = bread;
//		this.spreads = spreads;
//	}
	
	public Sandwich(Builder builder) {
		bread = builder.bread;
		spreads = builder.spreads;
		meats = builder.meats;
		salads = builder.salads;
	}
	
	
	
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads + "]";
	}



	public static class Builder {
		private String bread;
		private ArrayList<String> spreads;
		private ArrayList<String> meats;
		private ArrayList<String> salads;
		
		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<String>();
			meats = new ArrayList<String>();
			salads = new ArrayList<String>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}

		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}

		public Builder salad(String salad) {
			salads.add(salad);
			return this;
		}
		
		public Sandwich build() {
			return new Sandwich(this);
		}
		
		
	}

}
