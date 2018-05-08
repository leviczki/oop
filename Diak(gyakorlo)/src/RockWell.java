//Definialjon egy RockWell osztalyt, mely futtathato
public class RockWell {

	public static void main(String[] args) {
		
	 
		// TODO Auto-generated method stub

//Hozzon letre egy OvatosDiak peldanyt, tetszoleges adatokkal!
<<<<<<< HEAD
		OvatosDiak diak = new OvatosDiak("xy", 500, 300);
=======
		OvatosDiak diak = new OvatosDiak("xy", 600, 300);
>>>>>>> branch 'master' of https://github.com/LuciaJohns/oop.git
		
		
/*Itasson meg a peldannyal 300Ft-os sort annyiszor
ahanyszor kitelik a penzebol
Irja ki a megivott sorok szamait
es az aktualis penz mennyiseget!
*/	
		int sorokSzama = 0;
		while (diak.sorozik(300)) {
			sorokSzama++;
		}
		System.out.println("Sorok szama:" + sorokSzama);
		System.out.println("Penz mennyiseg:" + diak.forint);
			
		}
		
	}


