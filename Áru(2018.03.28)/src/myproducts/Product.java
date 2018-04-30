package myproducts;

public class Product {
	
	private String nev;
	private int nettoAr;
	private int Afakulcs;
	
	
	public Product(String nev, int nettoAr, int Afakulcs) {
		this.nev = nev;
		this.nettoAr = nettoAr;
		this.Afakulcs = Afakulcs;
		
	}

	public int bruttoAr() {
		return (int) (nettoAr * (1 + Afakulcs / 100.0));
		}

	@Override
	public String toString() {
		return "Product [nev=" + nev + ", bruttoAr()=" + bruttoAr() + "]";
	}
	
	public void noveles(int szazalek){
		nettoAr = (int) (nettoAr * (1+ szazalek / 100.0));
		}
	
	
	public int hasonlitas(Product termek) {
		if (bruttoAr() > termek.bruttoAr()){
		return 1;
		}
		else if (bruttoAr() < termek.bruttoAr()){
			return 0;
		}
		else{
			return -1;
		}
	}
	
}
