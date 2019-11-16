package oop;

class Person	{
	
	String name;
	String email;
	String phone;
	
	void walk()	{
		System.out.println(name + " is walking");
	}
	
	void eat()	{
		System.out.println(name + " is eating");
	}
	
	void sleep()	{
		System.out.println(name + " is sleeping");
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiating an object
		Person person1 = new Person();
		//Define some properties
		person1.name = "Steve";
		person1.email = "spensyl@vestmark.com";
		person1.phone = "7812965388";
		
		person1.walk();
		person1.sleep();
		
		Person person2 = new Person();	
			person2.name = "Sarah";
			person2.sleep();
		
		
		//person
		
		//attributes, variables, adjectives
		/*
		String name = "Steve";
		String email = "spensyl@vestmark.com";
		String phone = "7812965388";
		 
		walking(name);
		
		String name2 = "Sarah";
		String email2 = "sarah@test.com";
		String phone2 = "7819876543";
		
		walking(name2);
		
		//action, activity, behavior
		//System.out.println(name + " is walking");
		//System.out.println(name + " is eating");
	}
	static void walking(String name)	{
		System.out.println(name + " is walking");
*/
	}

}
