package sajat;


//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;

public class Proba2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int meret = 5;
		int tomb[] = new int [meret];
		Scanner bemenet = new Scanner (System.in);
		
		System.out.println("Kerem a szamokat:");
		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;
			
			do {
				System.out.println("Kerem adja meg a(z)" + (i + 1) + ". egesz szamot!");
				System.out.println("Szam:");
				
				try {
					tomb[i] = Integer.parseInt(bemenet.nextLine());
					rosszAdat = false;
					
				/*} catch (InputMismatchException e) {
					System.out.println("Nem egesz szam");
					System.out.println("Inp.Mis.");*/
				} catch (NumberFormatException e) {
					System.out.println("nem egesz szamot kaptunk");
				} catch (Exception e) {
					System.out.println("Elkaptuk a kivetelt(Exeption)");
				}
				
			} while (rosszAdat);
			
		}
		System.out.println("A beolvasott ertekek:");
		for (int i : tomb) {
		System.out.println(i);
		}
		bemenet.close();
	}

}
