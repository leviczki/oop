
public class TéglalapHasználó {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Téglalap a_objektum = new Téglalap(2);
			Téglalap b_objektum = new Téglalap(3, 4);
			Téglalap c_objektum;
			c_objektum = a_objektum;
			//Téglalap c_objektum = a_objektum;
			
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			a_objektum.setOldalak(5);
			
			System.out.println("");
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			a_objektum.setOldalak(3, 4);
			
			System.out.println("");
			System.out.println(a_objektum);
			System.out.println(b_objektum);
			System.out.println(c_objektum);
			
			System.out.println("");
			System.out.println("A és B Ugyan arra a objektumra/címre mutat: " + (a_objektum == b_objektum));
			System.out.println("A és C Ugyan arra a objektumra/címre mutata: "+ (a_objektum == c_objektum));
			System.out.println("A és B értéke egyenlő-e: " + a_objektum.egyezikE(b_objektum));
			
			
	}

}
