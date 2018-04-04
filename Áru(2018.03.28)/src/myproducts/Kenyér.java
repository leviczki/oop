package myproducts;

public class Kenyér extends Product {
		private double mennyiség;

		public Kenyér(String név, int nettóár, int áfakulcs, double mennyiség) {
			super(név, nettóár, áfakulcs);
			this.mennyiség = mennyiség;
		}

		@Override
		public String toString() {
			return "Kenyér [mennyiség=" + mennyiség + ", bruttóÁr()="
					+ bruttóÁr() + ", toString()=" + super.toString() + "]";
		}

		public double getMennyiség() {
			return mennyiség;
		}
		
		public static boolean elso_kenyer_nagyobb_egysegaru(Kenyér elso_kenyér, Kenyér második_kenyér){
			if(elso_kenyér.bruttóÁr()/elso_kenyér.mennyiség>második_kenyér.bruttóÁr()/második_kenyér.mennyiség){
				return true;
			}
			else {
				return false;
			}
		}

	}


