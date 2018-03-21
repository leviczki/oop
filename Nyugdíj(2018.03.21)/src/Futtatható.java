import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author janosi3
 *
 */
public class Futtatható {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 10;
		Scanner beolvasas = new Scanner (System.in);
		
		 System.out.println("Kérem az alkalmazottak számát: ");
		 
		int meret = beolvasas.nextInt();
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[meret];
		
		Random veletlenszam = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++){
			alkalmazottak[i] = new Alkalmazott("XY" + (i+1), veletlenszam.nextInt(Alkalmazott.getNyugdíjkorhatár()));	
		
		System.out.println(alkalmazottak[i]);
		}
		
		Alkalmazott.setNyugdíjkorhatár(70);
		
		System.out.println("\n megváltozott korhatár: \n");
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		beolvasas.close();
	}

}
