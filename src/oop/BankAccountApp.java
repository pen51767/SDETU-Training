package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "013654321";
		acc1.setName("Joe Smith");
		acc1.setSSN("027726202");
		System.out.println("CUSTOMER: " + acc1.getName());
		System.out.println("SSN: " + acc1.getSSN());
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		acc1.deposit(1500);

		System.out.println(acc1.toString());

		
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		
		/*
		acc3.accountNumber = "017523432";
		acc3.checkBalance();
				
		//Demo for Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Dave";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
