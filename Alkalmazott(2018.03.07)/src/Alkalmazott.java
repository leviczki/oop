
public class Alkalmazott {
	
	private String nev; //csak az alkalmazott osztalyon belul lehet latni(private)
	private long fizetes;//csak az alkalmazott osztalyon belul lehet latni(private)
	
	
	
	
	//Fizetes novelese
	public void fizetesNovelese(long novekmeny) {
		fizetes += novekmeny;
	}
	
	
	
	//stringbe osszefuzes source->tostring

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + "Ft";
	}
	
	
	
	//getter/setter metodus source -> generate getters/setters

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetesertek) {
		fizetes = fizetesertek;
		//b.o adattag név
	}
	
	
	
	//egy bizonyos intervallumba van a fizetes?:
	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes<= felsohatar;
	}
	
	//ados cucc...:
	public long fizetendoAdo() {
		//kenyszeritett konverzio(long)
		return (long)(fizetes * 0.16 * 12);
	}
	//nagyobb-e a fizetese mint a masiknak
	public boolean fizetesNagyobbMint(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
}
