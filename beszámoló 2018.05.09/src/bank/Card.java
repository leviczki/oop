package bank;

public class Card {
	private String name;
	private int egyenleg;
	
	
	public Card(String name, int egyenleg) {
		this.name = name;
		this.egyenleg = egyenleg;
	}


	public int getEgyenleg() {
		return egyenleg;
	}


	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}


	public String getName() {
		return name;
	}
	
	public boolean penzfelvetel(int osszeg){
		if((egyenleg - osszeg)>0){
			egyenleg-=osszeg;
			return true;
		}else return false;
	}


	@Override
	public String toString() {
		return "Card [name=" + name + ", egyenleg=" + egyenleg + "]";
	}
	
	
	
}
