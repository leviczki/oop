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
			//if(getEgyenleg() >= osszeg){  // "super." lemaradt....
			if(super.getEgyenleg() >= osszeg){
				super.setEgyenleg(super.getEgyenleg-osszeg);
			}else{
				super.setEgyenleg(super.getEgyenleg-osszeg);
				hitelkeret += super.getEgyenleg();//minusz a getEgyenleg, tehat levonni fog a hitelkeretbol
				super.setEgyenleg(0);//ne maradjon minusz, ha levonta a hitelkeretbol
				//hitelkeret = hitelkeret - (osszeg - setEgyenleg(0);
				//lemaradt a zárójel és a setEgyenlegneget nem tudod kivonni az osszegbol mert nincs visszateresi erteke (void)
			}
			return true;
		}else return false;
			//} //ez itt miiii?
	}

	@Override
	public String toString() {
		/*return "CreditCard [hitelkeret=" + hitelkeret + ", getEgyenleg()="
				+ getEgyenleg() + ", getName()=" + getName() + "]";*/
		return "Tulajdonos: "+super.getName+", egyenleg:"+super.getEgyenleg+", hitelkeret: "+hitelkeret;
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	
	
}


