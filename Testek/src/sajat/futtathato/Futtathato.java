package sajat.futtathato;

import sajat.*;

public class Futtathato {

	
	public static void main(String[] args) {
		
		
		Henger henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3, 4);
		
		System.out.println(henger1);
		System.out.println(henger1.getTerfogat());
		
		Teglatest teglatest = new Teglatest(5, 6, 7);
		System.out.println(teglatest);
		
		
		if(henger1.Nagyobbe(teglatest)){
			System.out.println("A henger 1 nagyobb");
		}else{
			System.out.println("A teglatest nagyobb");
		}
		
		
		
	}
}
