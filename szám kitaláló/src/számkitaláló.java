import static java.lang.System.out; 
import java.util.Scanner; 
import java.util.Random;

class számkitaláló {
	
public static void main(String args[]) { 
	Scanner billentyûzet = new Scanner(System.in);

	out.println("írj be egy egészet 1 és 10 között: ");
	int bekértSzám = billentyûzet.nextInt();
	int véletlenSzám = new Random().nextInt(10) + 1;
	if (bekértSzám == véletlenSzám){ 
		out.println ("**********");
		out.println("*Nyertél.*");
		out.println ("**********");
		}
	else {
		out.println("Vesztettél.");
		out.println("A véletlen szám ez volt: "); 
		out.println (véletlenSzám);
		out.println("Köszönöm a játékot.");
		}  
	
	billentyûzet.close();
	
	}
}