package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(fib(12));	
	}
	public static int fib(int n){
		if (n == 0){
			return 0;
	} 	else if (n == 1)	{
			return 1;
	}	
		return (fib(n-1) + fib(n-2));

		}
		
	}


