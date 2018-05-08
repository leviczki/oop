package szgep;

public abstract class Adathordozo {
	private  String marka; //tipus
	private double kapacitas;	  //kapacitas
	
	public Adathordozo(String marka, double kapacitas) {
		super();
		this.marka = marka;
		this.kapacitas = kapacitas;
	}

	public String getMarka() {
		return marka;
	}

	public double getkapacitas() {
		return kapacitas;
	}
	
	abstract double szabadHely();

	
	
}
