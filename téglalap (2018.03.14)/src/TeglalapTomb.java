
public class TeglalapTomb {
	
	public static void main(String[] args) {
		
		int meret = 10;
		Teglalap [] teglalapTomb = new Teglalap[meret];		
		for (int i = 0; i < teglalapTomb.length; i++) {
			teglalapTomb[i] = new Teglalap ((int)(Math.random() * 9)+2,(int)(Math.random() * 9)+2);
		 	System.out.println(teglalapTomb[i]);
		}

		
		
		int minelem = 0;
		for (int i = 1; i < teglalapTomb.length; i++) {
			if (teglalapTomb[minelem].nagyobbTeruletuMint(teglalapTomb[i])){
				minelem = i;
			}
		}
		
		
		
		System.out.println("\n A legkisebb teruletu \n" + teglalapTomb[minelem]);
	}
	
}

