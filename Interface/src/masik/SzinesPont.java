package masik;


import java.awt.Color;

import sajat.ISzinezheto;

public class SzinesPont extends Pont implements ISzinezheto {
	
	
	private Color szin;

	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	public SzinesPont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "SzinesPont [szin=" + szin + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public Color getAlapertelmezett() {
	
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color szin) {
		
		this.szin = szin;
	}

	
}
