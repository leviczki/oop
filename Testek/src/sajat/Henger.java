package sajat;


public class Henger extends Hasáb {
	
	private int sugar;
	
	
	public Henger(int magassag, int sugar) {
		super(magassag);
		this.sugar = sugar;
	}
	
	
	
	@Override
	public int getAlapterulet() {
		return (int) (sugar * sugar * Math.PI);
	}



	@Override
	public String toString() {
		return  sugar + "," + getMagassag();
	}

	

}
