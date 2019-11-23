package ExceptionsFiles;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment = true;
		// 1. Ask the user for input
		
		
		do {
			
		
		// 2. Get the amount and test the value
			System.out.print("Enter the Payment Amount: ");
		Scanner in = new Scanner(System.in);
		try	{
			payment = in.nextDouble();
			if (payment < 0)	{
				throw new NegativePaymentException(payment);
			} 
			else {
				positivePayment = true;
			}
		} catch (NegativePaymentException e)	{
			System.out.println(e.toString());
			System.out.println("PLEASE TRY AGAIN");
			positivePayment = false;
		}
		// 3. Handle Exceptions appropriately
		//payment = in.nextDouble();
		//System.out.println(amount);
		
		// 4. Print Confirmation
		} while(!positivePayment);
		System.out.println("THANK YOU FOR YOUR PAYMENT OF $" + payment);
	} 

}
