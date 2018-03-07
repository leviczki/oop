

/**
 * 
 */

/**
 * @author janosi3
 *
 */
public class AlkalmazottatHasznalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b.o statikus tipus        j.o dinamikus tipus
		Alkalmazott alkalmazottobj = new Alkalmazott();
		
		//private módosító még nem volt :
		//alkalmazottobj.nev = "Kiss István";
		//alkalmazottobj.fizetes = 10;
		
		//adatrejtés miatt (setter/getter):
		//név és fizetés beállítása:
		alkalmazottobj.setNev("Kiss István");
		alkalmazottobj.setFizetes(10);
		
		System.out.println(alkalmazottobj.toString());
		System.out.println(alkalmazottobj); //nem muszáj a tostring metódus
		
		//fizetés átállítása:
		alkalmazottobj.fizetesNovelese(5);
		//kiiratja a módosított fizetést és a nevet is
		System.out.println(alkalmazottobj);
		
		//(getter/setter)kiiratás csak a nevére vagyunk kíváncsiak:
		System.out.println("Alkalmazott neve: " + alkalmazottobj.getNev());
		//(getter/setter)csak a (módosított)fizetés kiiratása:
		System.out.println("Fizetése: " + alkalmazottobj.getFizetes());
		
		//meghívjuk a fizetésintervallumokközött metódust majd sysouttal kiiratja h igaz vagy hamis-e
		System.out
				.println("A fizetés 10 és 50 között van: " + alkalmazottobj.fizetésIntervallumokKözött(10, 50));
		System.out
		.println("A fizetés 5 és 6 között van: " + alkalmazottobj.fizetésIntervallumokKözött(5, 6));
		
		//kiiratja a kiszámolt adót:
		System.out.println(alkalmazottobj.fizetendoAdo());
		
		//nagyobb a másik metódus használata:
		
		//másik objektum létrehozása:
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(35);
		alkalmazott2.fizetesNovelese(11);
		System.out.println(alkalmazott2);
		
		//összehasonlítás:
			System.out
					.println("István fizetése a nagyobb: " + alkalmazottobj.fizetésNagyobbMint(alkalmazott2));
			System.out
					.println("Klaudia fizetése a nagyobb: " + alkalmazott2.fizetésNagyobbMint(alkalmazottobj));
			
		//alkalmazottak tömb:
				//5 elemű alkalmazottakat tartalmazó pointer tömb(objektumtömb)
			Alkalmazott[] alkalmazottak = new Alkalmazott[5];
			//Alkalmazott alkalmazottak[] = new Alkalmazott[5]; -> ez is elfogadható
				//alkalmazottak létrehozása: (ciklusszervezéssel)(objektumtömb feltöltése)
			for (int i = 0; i < alkalmazottak.length; i++) {
				 	alkalmazottak[i] = new Alkalmazott();//még null értékű
				 	alkalmazottak[i].setNev("XY");//név beállítása
				 	alkalmazottak[i].setFizetes((long)(Math.random() * 50));//fizetés beállítása random számmal
				 	System.out.println(alkalmazottak[i]);//alkalmazottak adatainak kiírása
			}
			//kinek a legmagasabb a fizetése a tömbben:(maxkeres)
			int maxelem = 0;
			for (int i = 1; i < alkalmazottak.length; i++) {
				if (alkalmazottak[i].getFizetes() > alkalmazottak[maxelem].getFizetes()){
					maxelem = i;
				}		   
			}
			System.out.println("Max fizetésű almalmazott: " + alkalmazottak[maxelem]);

	}
}