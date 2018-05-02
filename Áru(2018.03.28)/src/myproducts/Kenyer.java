package myproducts;

public class Kenyer extends Product {
		private double mennyiseg;

		public Kenyer(String nev, int nettoAr, int Afakulcs, double mennyiseg) {
			super(nev, nettoAr, Afakulcs);
			this.mennyiseg = mennyiseg;
		}

		@Override
		public String toString() {
			return "Kenyer [mennyiseg=" + mennyiseg + ", bruttoAr()="
					+ bruttoAr() + ", toString()=" + super.toString() + "]";
		}

		public double getMennyiseg() {
			return mennyiseg;
		}
		
		public static boolean elso_kenyer_nagyobb_egysegaru(Kenyer elso_kenyer, Kenyer masodik_kenyer){
			if(elso_kenyer.bruttoAr()/elso_kenyer.mennyiseg>masodik_kenyer.bruttoAr()/masodik_kenyer.mennyiseg){
				return true;
			}
			else {
				return false;
			}
		}

	}


