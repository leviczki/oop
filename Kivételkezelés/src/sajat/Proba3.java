package sajat;


//import java.io.InputStreamReader;
import java.io.*;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//import java.util.*;

public class Proba3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int meret = 5;
		int tomb[] = new int [meret];
		
		
		
		//Scanner bemenet = new Scanner (System.in);
		
		System.out.println("Kerem a szamokat:");
		for (int i = 0; i < tomb.length; i++) {
			
			try {
				InputStreamReader bemenetolvaso = new InputStreamReader(System.in);
				BufferedReader beolvasas = new BufferedReader(bemenetolvaso);
				
				//String sztring = beolvasas.readLine();
				
				boolean rosszAdat = true;
				
				do {
					System.out.println("Kerem adja meg a(z)" + (i + 1) + ". egesz szamot!");
					System.out.println("Szam:");
					
					try {
						//tomb[i] = Integer.parseInt(bemenet.nextLine());
						tomb [i] = Integer.valueOf(beolvasas.readLine()).intValue();
						rosszAdat = false;
						
					} catch (NumberFormatException e) {
						System.out.println("nem egesz szamot kaptunk");
					}
					
				} while (rosszAdat);
				
			} catch (IOException e) {
				// TODO: handle exception
			}
			
			
			
		}
		System.out.println("A beolvasott ertekek:");
		for (int i : tomb) {
		System.out.println(i);
		}
		//bemenet.close();
	}

}
