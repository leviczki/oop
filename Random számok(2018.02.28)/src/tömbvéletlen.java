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
		int tomb [] = new int [10]; //10 elemu tomb lefoglalasa
		
		Random veletlenobjektum = new Random(); //random tipusu veletlen objektum
		
		System.out.println("A tomb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			tomb [i] = veletlenobjektum.nextInt(50)+1;  //for ciklusba feltoltom veletlen szamokkal 0-50 kozotti
			System.out.println(tomb[i]);
		}
		System.out.println("Visszafele:");
		for (int i = tomb.length-1; i >= 0; i--) {
			
			System.out.println(tomb[i]);
			
		}
		int maxindex = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > tomb[maxindex]) {
				maxindex = i;	
			}	
		}
		System.out.println("A legnagyobb ertek:");
		System.out.println(tomb[maxindex]);
			
		
		}
		

	}


