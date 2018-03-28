package myproducts;

public class Kenyér extends Product {
		private double mennyiség;

		public Kenyér(String név, int nettóár, int áfakulcs, double mennyiség) {
			super(név, nettóár, áfakulcs);
			this.mennyiség = mennyiség;
		}
		

	}


