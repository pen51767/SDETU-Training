package basics;

public class Cities {

	public static void main(String[] args) {
		// DECLARE and Define and Array
		String[] cities = {"New York", "Miami", "San Francisco", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		// Declare the Countries Array
		String[] countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Mexico";
		System.out.println(countries[2]);
		System.out.println("*******************************");
		
		// Declare the States Array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0; 
		
		//Do Loop: Enters the loop and tests the condition
		do	{
		System.out.println("STATE: " + states[i]);
		i = i + 1;
		} while (i < 5);
		
		//While Loop: Tests the condition then enters the loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound)	{
				String state = states[n];
				if (state == "Texas")	{
					System.out.println("STATE FOUND");
					stateFound = true;
				}
			n++;
		}	
		System.out.println("\nPRINTING WITH FOR LOOP\n");
		for (int x = 0; x < 5; x++)	{
			System.out.println(states[x]);
		}
		
	}
}
