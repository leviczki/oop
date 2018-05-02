import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author janosi3
 *
 */
public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 10;
		Scanner beolvasas = new Scanner (System.in);
		
		 System.out.println("Kerem az alkalmazottak szamat: ");
		 
		int meret = beolvasas.nextInt();
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[meret];
		
		Random veletlenszam = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++){
			alkalmazottak[i] = new Alkalmazott("XY" + (i+1), veletlenszam.nextInt(Alkalmazott.getNyugdijkorhatar()));	
		
		System.out.println(alkalmazottak[i]);
		}
		
		Alkalmazott.setNyugdijkorhatar(70);
		
		System.out.println("\n megvaltozott korhatar: \n");
		for (Alkalmazott alkalmazott : alkalmazottak) {
			System.out.println(alkalmazott);
		}
		
		beolvasas.close();
	}

}
