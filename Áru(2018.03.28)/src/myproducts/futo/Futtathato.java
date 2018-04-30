package myproducts.futo;
import myproducts.*;

public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product aru_objektum = new Product("Aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("Kenyer", 100, 15, 0.75);
		
		System.out.println("A termek adatai");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();
		
		int melyik_dragabb = aru_objektum.hasonlitas(kenyer_objektum);
				
			if(melyik_dragabb > 0){
				System.out.println("Aru a dragabb\n" + aru_objektum);
			}
			else if (melyik_dragabb < 0){
				System.out.println("kenyer a dragabb\n" + kenyer_objektum);
			}
			else{
			System.out.println("egyforma a brutto Aru\n");
		}
		
			Product aru2 = new Kenyer("kenyer2", 210, 15, 1);
			System.out.println("aru2.toString() eredmenye:");
			System.out.println(aru2); //kesoi kotes
			
			System.out.println(((Kenyer) aru2).getMennyiseg());
		
	}

}
