package myproducts;

public class Product {
	
	private String név;
	private int nettóár;
	private int áfakulcs;
	
	
	public Product(String név, int nettóár, int áfakulcs) {
		this.név = név;
		this.nettóár = nettóár;
		this.áfakulcs = áfakulcs;
		
	}

	public int bruttóÁr() {
		return (int) (nettóár * (1 + áfakulcs / 100.0));
		}

	@Override
	public String toString() {
		return "Product [név=" + név + ", bruttóÁr()=" + bruttóÁr() + "]";
	}
	
	public void növelés(int szazalek){
		nettóár = (int) (nettóár * (1+ szazalek / 100.0));
		}
	
	
	public int hasonlítás(Product termék) {
		if (bruttóÁr() > termék.bruttóÁr()){
		return 1;
		}
		else if (bruttóÁr() < termék.bruttóÁr()){
			return 0;
		}
		else{
			return -1;
		}
	}
	
}
