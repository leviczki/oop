
import java.util.Scanner;

/**
 * 
 */

/**
 * @author janosi3
 *
 */
public class mértaniátlag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tomb [] = new double [3]; 
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Adja meg a "+ (i + 1) + ".elemet");
			tomb[i] = bemenet.nextDouble();
		}
		
		//double mertani_atlag = 1;
		
		bemenet.close();

	}

}
