
public class Alkalmazott {
	
	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = kor * 10000;
	}
	
	public int hatravan(){
		return nyugdijkorhatar-kor;
	}


	@Override
	public String toString() {
		return "Alkalmazott nev: " + nev + ",\t kor: " + kor + ",\t fizetes: "
				+ fizetes + ",\t hatravan:  " + hatravan() + "";
	}


	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}


	public static Alkalmazott tobbEveVanHatraNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hatravan()>masodikAlkalmazott.hatravan()) {
			return elsoAlkalmazott;
		}
		else{ 
			return masodikAlkalmazott;
		}
	}
}

