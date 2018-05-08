package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*
public class Proba4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10.gyakorlat 1.es feladat 4.pont(beszamolo utolso resze hasonlolesz)
		
		//5 elemu integer tomb
		int meret = 5;
		int[] egeszTomb = new int [meret]; //ez csak egy tomb konkret ertekekkel kell feltolteni
		
		//input steamreader osztaly
		InputStreamReader bemenetiAdatfolyam = new InputStreamReader(System.in);//system.in szabvanyos bemenet
		//buffered reader
		BufferedReader beolvasas = new BufferedReader(bemenetiAdatfolyam);
		
		//ioexception kötelezö lekezelni
		
		//BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in));
		
		//tombot ciklusba szervezni
		for (int i = 0; i < egeszTomb.length; i++) {
			//kivétel lekezelése
			try {
				boolean rosszAdat = true;
				
				do {
					System.out.println(" Kerem adja meg " + (i + 1)
							+ ".egesz szamot!\n");
					System.out.print(" szam: ");
					
					/*//readline stringet ad vissza intre alakitjuk
					String sztring = beolvasas.readLine();
					egeszTomb[i] = Integer.parseInt(sztring);
					rosszAdat = false;
					*/
					
					//numberformatexception lekezelése
					try {
						//readline stringet ad vissza intre alakitjuk
						String sztring = beolvasas.readLine();
						egeszTomb[i] = Integer.parseInt(sztring);
						rosszAdat = false;
					} catch (NumberFormatException e) {
						System.out.println("Nem egesz szamot kaptunk! \t Kerem adja meg ujbol! \n");
					}
					
					
				} while (rosszAdat);
				
			} catch (IOException kivetelObjektum) {
				kivetelObjektum.printStackTrace();
			}//try
			
			
		}//for
		
		//kiiratas
		System.out.println("A tomb elemei: ");
		for (int i : egeszTomb) {
			System.out.println(i);
		}
	
		
		
	}//main

}//class
