import java.util.Scanner;

/**
 * 
 */

/**
 * @author janosi3
 * bekérni 3 számot
 * a gyök alatt nem lehet negatív szám
 * b-4ac a gyök alatt = D
 * d= diszkrimináns
 * me= elsõ megoldás
 * mk=második megoldás
 * m=megoldás ha csak egy van
 *2018.02.28
 *
 */
public class másodfokú {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az elso számot:");
		System.out.print("a:");
		double a = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az második számot:");
		System.out.print("b:");
		double b = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az harmadk számot:");
		System.out.print("c:");
		double c = bemenet.nextDouble();
		

		double d = b*b-4.0*a*c; //d = diszkrimináns
		Math.sqrt(d);
		
		if(d<0){
			System.out.println("Nincs megoldás");
		}
		
		else if(d==0){
			double m = (-b)/(2.0*a);
			System.out.println("Az egyetlen megoldás:  "+m); //m= megoldás
		}
		
		else if(d>0){
			double me = (-b+d)/(2.0*a);
			double mk = (-b-d)/(2.0*a);
			System.out.println("A két megoldás:"+me + " " +mk); //me= elsõ megoldás, mk= második megoldás
		}
		
		bemenet.close();
	}

}
