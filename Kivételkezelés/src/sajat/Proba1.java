package sajat;


//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*;

public class Proba1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int meret = 5;
		int tomb[] = new int [meret];
		Scanner bemenet = new Scanner (System.in);
		
		System.out.println("Kérem a számokat:");
		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;
			
			do {
				System.out.println("Kerem adja meg a(z)" + (i + 1) + ". egész számot!");
				System.out.println("Szám:");
				
				try {
					tomb[i] = bemenet.nextInt();
					rosszAdat = false;
					
				} catch (InputMismatchException e) {
					//System.out.println(e.getMessage());
					//System.out.println(e);
					System.out.println("Elkaptuk a kivételt");
				} catch (Exception e) {
					System.out.println("Elkaptuk a kivételt");
					
				}finally {
					bemenet.nextLine();
				}
				
			} while (rosszAdat);
			
		}
		System.out.println("A beolvasott értékek:");
		for (int i : tomb) {
		System.out.println(i);
		}
		bemenet.close();
	}

}
