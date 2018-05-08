
//Irjon egy OvatosDiak osztalyt a Diak osztaly leszarmozattjakent
public class OvatosDiak extends Diak {
	
/*amely kepes tarolni azt az osszeget, amit a diak a hazautra utikoltsegkent felretesz
(mert utal gyalogolni)
*/
	int utiKoltseg;
	
//Definialjon konstruktort, amellyel egy peldany adatai beallithatok!
	public OvatosDiak(String nev, int forint, int utiKoltseg) {
		super(nev, forint);
		this.utiKoltseg = utiKoltseg;
	}

	
//Definialja felul a sorozik metodust ugy, hogy
//csak akkor csokkenti az ital araval a penz mennyiseget
//ha meg marad az utikoltsegre
//es csak ekkor ad vissza igaz erteket
//(ha csak reszben fedezne amaradek penz az italt, akkor mar ne vonja le)
	//@Override
		public boolean sorozik(int sorAr) {
			if (getForint()>= sorAr+utiKoltseg  ) {
				return super.sorozik(sorAr);
			} else {
				return false;
			}
			
		}
/*Definialja az osztalyra a toString metodust ugy,
hogy a "Penzmag:" szoveg utan kiirja a utikoltsegen 
felul meglevo penz mennyiseget.
*/
	
	//@Override
	public String toString() {
		return "Penzmag:" + utiKoltseg +
				getForint() + super.toString();
	}
	
}
