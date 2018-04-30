

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
		
		//private modositomeg nem volt :
		//alkalmazottobj.nev = "Kiss Istvan";
		//alkalmazottobj.fizetes = 10;
		
		//adatrejtes miatt (setter/getter):
		//nev es fizete©s beallitasa:
		alkalmazottobj.setNev("Kiss Istvan");
		alkalmazottobj.setFizetes(10);
		
		System.out.println(alkalmazottobj.toString());
		System.out.println(alkalmazottobj); //nem muszaj a tostring metodus
		
		//fizetes beallitasa:
		alkalmazottobj.fizetesNovelese(5);
		//kiiratja a modositott fizetest es a nevet is
		System.out.println(alkalmazottobj);
		
		//(getter/setter)kiiratas csak a nevere vagyunk kivancsiak:
		System.out.println("Alkalmazott neve: " + alkalmazottobj.getNev());
		//(getter/setter)csak a (modositott)fizetes kiiratasa:
		System.out.println("Fizetese: " + alkalmazottobj.getFizetes());
		
		//meghivjuk a fizetesintervallumokkozott metodust majd sysouttal kiiratja h igaz vagy hamis-e
		System.out
				.println("A fizetes 10 es 50 kozott van: " + alkalmazottobj.fizetesIntervallumokKozott(10, 50));
		System.out
		.println("A fizetes 5 es 6 kozott van: " + alkalmazottobj.fizetesIntervallumokKozott(5, 6));
		
		//kiiratja a kiszamolt adot:
		System.out.println(alkalmazottobj.fizetendoAdo());
		
		//nagyobb a masik metodus hasznalata:
		
		//masik objektum letrehozasa:
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(35);
		alkalmazott2.fizetesNovelese(11);
		System.out.println(alkalmazott2);
		
		//osszehasonlitas:
			System.out
					.println("Istvan fizetese a nagyobb: " + alkalmazottobj.fizetesNagyobbMint(alkalmazott2));
			System.out
					.println("Klaudia fizetese a nagyobb: " + alkalmazott2.fizetesNagyobbMint(alkalmazottobj));
			
		//alkalmazottak tomb:
				//5 elemo alkalmazottakat tartalmazo pointer tomb(objektumtomb)
			Alkalmazott[] alkalmazottak = new Alkalmazott[5];
			//Alkalmazott alkalmazottak[] = new Alkalmazott[5]; -> ez is elfogadhato
				//alkalmazottak letrehozasa: (ciklusszervezessel)(objektumtomb feltoltese)
			for (int i = 0; i < alkalmazottak.length; i++) {
				 	alkalmazottak[i] = new Alkalmazott();//meg null erteku
				 	alkalmazottak[i].setNev("XY");//nev beallitasa
				 	alkalmazottak[i].setFizetes((long)(Math.random() * 50));//fizetes beallitasa random szammal
				 	System.out.println(alkalmazottak[i]);//alkalmazottak adatainak kiiratasa
			}
			//kinek a legmagasabb a fizetese a tombben:(maxkeres)
			int maxelem = 0;
			for (int i = 1; i < alkalmazottak.length; i++) {
				if (alkalmazottak[i].getFizetes() > alkalmazottak[maxelem].getFizetes()){
					maxelem = i;
				}		   
			}
			System.out.println("Max fizetesu almalmazott: " + alkalmazottak[maxelem]);

	}
}