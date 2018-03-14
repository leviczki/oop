
public class Téglalap {
	private int a_oldal; 
	private int b_oldal;
	
	//konstruktúr speciális metódus jellemőze hogy megegyezik az osztály nevével
	//nincs visszatérésé értéke(nem is írjuk ki)
	//paraméterek megegyeznek az adattagok nevével
	//létrehozása source menü
	public Téglalap(int a_oldal, int b_oldal) {
		//super();						//ősre mutató //minden osztály őse az object
		setOldalak (a_oldal, b_oldal);
	}
	//egy metódust többször is megírhatunk különböző paraméterlistával = metódus overloading = többalakúság
	//korai kötés
	//fordítási időbe összeköti a metódust
	//a paraméterekről fogja tudni melyik metódust kell meghívni
	
	public Téglalap(int oldalhossz) {
		//super();
		//this.a_oldal = this.b_oldal = oldalhossz;
		//setOldalak(oldalhossz);<---ez is jó
		this(oldalhossz, oldalhossz); 
	}
	
	public int terület() {
		int terület = this.a_oldal * this.b_oldal;
		return terület;
	}

	@Override //polimorfizmushoz kapcsolódik felüldefiniálás
	public String toString() {
		return "a = " + a_oldal + ", b = " + b_oldal
				+ ", Terület : " + terület();
	}
		//metódusok és setterek törzsének kicserélése
	public void setOldalak(int a_oldal , int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	public void setOldalak(int oldalhossz) {
		setOldalak (oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTerületűMint(Téglalap másikTéglalap) {
		return terület() > másikTéglalap.terület();
	}
	
	public boolean egyezikE(Téglalap másikTéglalap) {
		return a_oldal == másikTéglalap.a_oldal && b_oldal == másikTéglalap.b_oldal;
	}
}
