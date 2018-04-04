package mypersons;

public class Child extends Person {
	
	private String School;

	public Child(String name, int age, String school) {
		super(name, age);
		this.School = school;
	}

	@Override
	public String toString() {
		return "Child [School=" + School + ", toString()=" + super.toString()
				+ "]";
	}

	public String getSchool() {
		return School;
	}
	
}
