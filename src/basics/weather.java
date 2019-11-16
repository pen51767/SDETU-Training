package basics;

public class weather {
	
	public static void main(String[] args)	{
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80)	{
			System.out.println("It's pleasent. Wear shorts and a t-shirt");
		} else if((temperature > 60) && (sunCondition == "Sunny"))	{
			System.out.println("It's a little cooler. Wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		} else if((temperature > 50 || sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear a long-sleeve shirt and jeans");
		}
		else	{
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		
	}

}
