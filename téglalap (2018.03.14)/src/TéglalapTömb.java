
public class TéglalapTömb {
	
	public static void main(String[] args) {
		
		int meret = 10;
		Téglalap [] téglalapTömb = new Téglalap[meret];		
		for (int i = 0; i < téglalapTömb.length; i++) {
		 	téglalapTömb[i] = new Téglalap ((int)(Math.random() * 9)+2,(int)(Math.random() * 9)+2);
		 	System.out.println(téglalapTömb[i]);
		}

		
		
		int minelem = 0;
		for (int i = 1; i < téglalapTömb.length; i++) {
			if (téglalapTömb[minelem].nagyobbTerületűMint(téglalapTömb[i])){
				minelem = i;
			}
		}
		
		
		
		System.out.println("\n A legkisebb területű: \n" + téglalapTömb[minelem]);
	}
	
}

