package szgep;

public class Merevlemez extends Adathordozo {

	private double foglalt_terulet;

	public Merevlemez(String marka, double kapacitas, double foglalt_terulet) {
		super(marka, kapacitas);
		this.foglalt_terulet = foglalt_terulet;
	}

	public double getFoglalt_terulet() {
		return foglalt_terulet;
	}

	@Override
	double szabadHely() {
		return getkapacitas() - foglalt_terulet;
		
	}

	@Override
	public String toString() {
		return "Merevlemez [foglalt_terulet=" + foglalt_terulet + ", szabadHely()=" + szabadHely() + ", getMarka()="
				+ getMarka() + ", getkapacitas()=" + getkapacitas() + "]";
	}
	
	public boolean Oszehasonlitas(Adathordozo masik_merevlemez) {
		if (szabadHely() > masik_merevlemez.szabadHely()) {
			return true;
		}
		return false;
	}
	
	public static Adathordozo NagyobbatAdVissza(Adathordozo merevlemez1, Adathordozo merevlemez2) {
		if (merevlemez1.getkapacitas() > merevlemez2.getkapacitas()){
			return merevlemez1;
		}else return merevlemez2;
	}
	

}
