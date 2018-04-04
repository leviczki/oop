package mypersons;

public class Adult extends Person {
	
	private String Workspace;

	public Adult(String name, int age, String workspace) {
		super(name, age);
		this.Workspace = workspace;
	}

	@Override
	public String toString() {
		return "Adult [Workspace=" + Workspace + ", toString()="
				+ super.toString() + "]";
	}

	public String getWorkspace() {
		return Workspace;
	}
	
	
}
