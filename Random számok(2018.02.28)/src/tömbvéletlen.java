import java.util.Random;

/**
 * 
 */

/**
 * @author janosi3
 *
 */
public class tömbvéletlen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tomb [] = new int [10]; //10 elemű tömb lefoglalása
		
		Random veletlenobjektum = new Random(); //random tipusú véletlen objektum
		
		System.out.println("A tömb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			tomb [i] = veletlenobjektum.nextInt(50)+1;  //for ciklusba feltöltöm a tömb elemét véletlen számokkal 0-50 közötti
			System.out.println(tomb[i]);
		}
		System.out.println("Visszafelé:");
		for (int i = tomb.length-1; i >= 0; i--) {
			
			System.out.println(tomb[i]);
			
		}
		int maxindex = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > tomb[maxindex]) {
				maxindex = i;	
			}	
		}
		System.out.println("A legnagyobb érték:");
		System.out.println(tomb[maxindex]);
			
		
		}
		

	}


