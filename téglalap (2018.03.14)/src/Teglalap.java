
public class Teglalap {
	private int a_oldal; 
	private int b_oldal;
	
	//konstruktor specialis metodus, jellemzoje, hogy megegyezzik az osztaly nevevel
	//nincs visszateresi erteke(nem is irjuk ki)
	//parameterek megegyeznek az adattagok nevevel
	//letrehozasa source menu
	public Teglalap(int a_oldal, int b_oldal) {
		//super();						//osre mutat //minden osztaly ose az object
		setOldalak (a_oldal, b_oldal);
	}
	//egy metodust tobbszor is megirhatunk kulonbozo parameter listaval = metodusoverloading = tobbalakusag
	//korai kotes
	//forditasi idoben osszekoti a metodust
	//parameterekbol tudja hogy melyiket kell meghivnia
	
	public Teglalap(int oldalhossz) {
		//super();
		//this.a_oldal = this.b_oldal = oldalhossz;
		//setOldalak(oldalhossz);		<---ez is jo
		this(oldalhossz, oldalhossz); 
	}
	
	public int terulet() {
		int terulet = this.a_oldal * this.b_oldal;
		return terulet;
	}

	@Override //polimorfizmushoz kapcsolodik, feluldefinialas
	public String toString() {
		return "a = " + a_oldal + ", b = " + b_oldal
				+ ", terulet : " + terulet();
	}
		//metodusok es setterek torzsenek kicserelese
	public void setOldalak(int a_oldal , int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	public void setOldalak(int oldalhossz) {
		setOldalak (oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTeruletuMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyezikE(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal && b_oldal == masikTeglalap.b_oldal;
	}
}
