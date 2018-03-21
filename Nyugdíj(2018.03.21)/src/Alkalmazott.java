
public class Alkalmazott {
	
	private String nev;
	private int kor;
	private long fizetés;
	
	private static int nyugdíjkorhatár = 65;

	public Alkalmazott(String nev, int kor, long fizetés) {
		this.nev = nev;
		this.kor = kor;
		this.fizetés = fizetés;
	}
	
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetés = kor * 10000;
	}
	
	public int hátravan(){
		return nyugdíjkorhatár-kor;
	}


	@Override
	public String toString() {
		return "Alkalmazott nev: " + nev + ",\t kor: " + kor + ",\t fizetés: "
				+ fizetés + ",\t hátravan:  " + hátravan() + "";
	}


	public static void setNyugdíjkorhatár(int nyugdíjkorhatár) {
		Alkalmazott.nyugdíjkorhatár = nyugdíjkorhatár;
	}
	
	public static int getNyugdíjkorhatár() {
		return nyugdíjkorhatár;
	}


	public static Alkalmazott többÉveVanHátraNyugdíjig(Alkalmazott elsőAlkalmazott, Alkalmazott másodikAlkalmazott) {
		if (elsőAlkalmazott.hátravan()>másodikAlkalmazott.hátravan()) {
			return elsőAlkalmazott;
		}
		else{ 
			return másodikAlkalmazott;
		}
	}
}

