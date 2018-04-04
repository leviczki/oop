package mypersons.personTest;

import java.util.Scanner;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;



public class Running {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1;
		//Person person2;
		
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("name:");
		name = input.nextLine();
		System.out.println("age:");
		age = input.nextInt(); input.nextLine();
		
		if(age < 18){
			
			System.out.println("School: ");
			String School = input.nextLine();
			person1 = new Child(name, age, School);
		}
		else{
			System.out.println("Workspace: ");
			String Workspace = input.nextLine();
			person1 = new Adult(name, age, Workspace);			
		}
		System.out.println(person1);
		System.out.println(person1.getClass());
		System.out.println("\nPerson:");
		System.out.println(person1 instanceof Person);
		System.out.println("\nChild:");
		System.out.println(person1 instanceof Child);
		System.out.println("\nAdult:");
		System.out.println(person1 instanceof Adult);
		
		input.close();
		
	}

}
