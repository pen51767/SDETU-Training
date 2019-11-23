package ExceptionsFiles;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		doMath(12, 0);
		System.out.println("Program continues");
		
	}
	
	public static void doMath(int a, int b)	{
		answer(a, b);
		//System.out.println(c);
		
	}
	
	public static double answer(int x, int y)	{
		//catch error here
		return x/y;
	}

}
