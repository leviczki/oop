package myproducts.futó;
import myproducts.*;

public class Futtatható {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product aru_objektum = new Product("Áru", 20, 27);
		Kenyér kenyér_objektum = new Kenyér("Kenyér", 100, 15, 0.75);
		
		System.out.println("A termék adatai");
		System.out.println(aru_objektum);
		System.out.println(kenyér_objektum);
		System.out.println();
		
		int melyik_dragabb = aru_objektum.hasonlítás(kenyér_objektum);
				
			if(melyik_dragabb > 0){
				System.out.println("Aru a dragabb\n" + aru_objektum);
			}
			else if (melyik_dragabb < 0){
				System.out.println("kenyér a dragabb\n" + kenyér_objektum);
			}
			else{
			System.out.println("egyforma a brutto ár\n");
		}
		
			Product aru2 = new Kenyér("kenyér2", 210, 15, 1);
			System.out.println("aru2.toString() eredménye:");
			System.out.println(aru2); //késői kötés
			
			System.out.println(((Kenyér) aru2).getMennyiség());
		
	}

}
