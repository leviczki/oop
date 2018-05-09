package bank;

public class CreditCard extends Card {
	
	private int hitelkeret;

	public CreditCard(String name, int egyenleg) {
		super(name, egyenleg);
		this.hitelkeret = 100000;
	}

	public CreditCard(String name, int egyenleg, int hitelkeret) {
		super(name, egyenleg);
		this.hitelkeret = hitelkeret;
	}

	@Override
	public boolean penzfelvetel(int osszeg) {
		if(hitelkeret + getEgyenleg() >= osszeg){
			if(getEgyenleg() >= osszeg){
				super.penzFelvetel(osszeg);
			}else{
				hitelkeret = hitelkeret - (osszeg - setEgyenleg(0);
			}
			return true;
		}else return false;
			}
	}

	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + ", getEgyenleg()="
				+ getEgyenleg() + ", getName()=" + getName() + "]";
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	
	
}


