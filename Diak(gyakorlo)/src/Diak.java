
//Definialjon egy diak osztalyt, amely kepes tarolni
//egy diak nevet
//es atr hogy hany forint va a zsebeben
public class Diak {
	String nev ;
	int forint = 500;
	
//Definialjon konstruktort amellyel egy peldany adatai beallithatok
	public Diak(String nev, int forint) {
		super();
		this.nev = nev;
		this.forint = forint;
	}
	
//Definialjon egy metodust amely visszaadja a penzenek a mennyiseget
	public int getForint() {
		return forint;
	}
	
//Definialjon egy sorozik metodust, amely parametereben kapja meg a sor arat
//amivel csokkenti a penz mennyiseget
//ha kitelik belole, es ilyenkor igaz erteket ad vissza, egyebkent hamisat
	public boolean sorozik(int sorAr) {
		if (forint >= sorAr) {
			forint = forint-sorAr;
			return true;
		}else {
			return false;
		}
		
	}

}
