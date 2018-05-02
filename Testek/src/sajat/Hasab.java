package sajat;

public abstract class Hasab {
		protected int magassag;

		public Hasab(int magassag) {
			this.magassag = magassag;
		}

		public int getMagassag() {
			return magassag;
		}
		
		
		public abstract int getAlapterulet ();
			
		
		public int getTerfogat() {
			return getAlapterulet () * magassag;
		}
		
		public boolean Nagyobbe(Hasab masik) {
			return getTerfogat() > masik.getTerfogat();
		}
		
		
}
