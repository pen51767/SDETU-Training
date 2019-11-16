package basics;

public class SalaryCalculator {
	
	public static void main(String[] args)	{
		//Create a variable to define our career
		
		String career;
		System.out.println("Program is starting");
		career = "Web Developer";
		System.out.println("My career is: " + career);
		
		//Define additional variables
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + "is " + salary + " per year");

		
		
	}

}
