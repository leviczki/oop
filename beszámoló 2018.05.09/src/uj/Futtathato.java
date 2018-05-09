package uj;

import java.util.Scanner;

import bank.CreditCard;

public class Futtathato {

	/**
	 * @param args
	 */
	//adatbeolvasás 5 kártya amiból 2 hitel
	//3 pénzfelvétel művelet adatbeolvasás + sikerült-e?
	//írja ki az összes adatot
	public static void main(String[] args) {
		int meret = 5;
		int tomb[] = new int[meret];
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		for (int i = 0; i < tomb.length; i++) {
			
			
			System.out.println("Kérem az adatokat");
			String name = scanner.nextLine();
			int egyenleg = Integer.parseInt(scanner.nextLine());
			int hitelkeret = Integer.parseInt(scanner.nextLine());
			
			CreditCard hitelkartya = new CreditCard(name, egyenleg, hitelkeret);
			
		}
		for (int i : tomb) {
			System.out.println(tomb[i]);
		}
		
		//legnagyobb egyenleg?
		//hány kártyán fogyott el a hitelkeret?
		
		scanner.close();
	}

}
