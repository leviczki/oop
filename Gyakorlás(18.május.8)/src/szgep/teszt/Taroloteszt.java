package szgep.teszt;

import java.util.Scanner;

import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meret = 5;
		Merevlemez tomb[] = new Merevlemez[meret];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Adja meg a "+  (i + 1) + ".elemet");
			String marka = scanner.nextLine();
			int kapacitas = Integer.parseInt(scanner.nextLine());
			int foglalt_terulet = Integer.parseInt(scanner.nextLine());
			tomb[i] = new Merevlemez(marka,kapacitas,foglalt_terulet);
			
			
			
		}
		for(Merevlemez x : tomb) {
		System.out.println(x);
		}
		
	}

}
