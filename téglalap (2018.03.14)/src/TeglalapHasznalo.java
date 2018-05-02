
public class TeglalapHasznalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teglalap a_objektum = new Teglalap(2);
		Teglalap b_objektum = new Teglalap(3, 4);
		Teglalap c_objektum;
			c_objektum = a_objektum;
			//Teglalap c_objektum = a_objektum;
			
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
			System.out.println("A es B Ugyan arra a objektumra/cimre mutat: " + (a_objektum == b_objektum));
			System.out.println("A es C Ugyan arra a objektumra/cimre mutata: "+ (a_objektum == c_objektum));
			System.out.println("A es B erteke egyenlo-e: " + a_objektum.egyezikE(b_objektum));
			
			
	}

}
