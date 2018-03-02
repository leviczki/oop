
public class GoodDoogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());
		one.bark();
		two.bark();
		
		GoodDog[] pets;
		pets = new GoodDog[7];
		
		pets[0] = new GoodDog();
		pets[1] = new GoodDog();
		
		pets[0].setSize(20);
		pets[1].setSize(8);
		System.out.println("Dog one: " + pets[0].getSize());
		System.out.println("Dog two: " + pets[1].getSize());
		pets[0].bark();
		pets[1].bark();
	}

}
