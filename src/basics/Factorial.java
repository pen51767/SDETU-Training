package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(num(7));
			System.out.println(fact(7));

		}	
	

	// Returns sum of all digits in numbers from 1 to n 
	 

	
	public static long fact(int n) {
		if (n == 0)	{
			return 1;
		} System.out.println(n);
			return fact(n-1);
		}
	
	public static long num(int n)	{
	    if (n == 1)	{
	    	return 1;
	    } else 	{
	    	long num = n;
		    for (int x = 1; x <= n; x++)	{
		    	
		    return	num += num(x); 
		}
	}
		return n;
	
	}
	
}
