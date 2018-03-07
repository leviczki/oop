
public class Alkalmazott {
	
	private String nev; //csak az alkalmazott osztályon belül lehet látni(private)
	private long fizetes;//csak az alkalmazott osztályon belül lehet látni(private)
	
	
	
	
	//Fizetés növelése:
	public void fizetesNovelese(long novekmeny) {
		fizetes += novekmeny;
	}
	
	
	
	//stringbe összefűzés source->tostring

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + "Ft";
	}
	
	
	
	//getter/setter metódus source -> generate getters/setters

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
	
	
	
	//egy bizonyos intervallumba van a fizetés?:
	public boolean fizetésIntervallumokKözött(long alsóhatár, long felsőhatár) {
		return fizetes >= alsóhatár && fizetes<= felsőhatár;
	}
	
	//adós cucc...:
	public long fizetendoAdo() {
		//kényszerített konverzió(long)
		return (long)(fizetes * 0.16 * 12);
	}
	//nagyobb-e a fizetése mint a másiknak
	public boolean fizetésNagyobbMint(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
}
