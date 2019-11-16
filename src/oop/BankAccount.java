package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	private static final String routingNumber = "017625901";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;

	//Constructor Definitions: Unique Methods
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are implicitly called upon instantiation
		//3. Same name as the class itself
		//4. Constructors have NO return type
	
	BankAccount()	{
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: Call same method name with different arguments
	BankAccount(String accountType)	{
		System.out.println("NEW ACCOUNT: " + accountType);
	}      
	
	BankAccount(String accountType, double initDeposit)	{
		//initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000)	{
			 Msg = "ERROR: Minimum Deposit must be at least $1000.00";
		} else {
			 Msg = "Thank you for your deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Getters and Setters
	public void setName(String name)	{
		this.name = name;		
	}
	
	public String getName()	{
		return name;
	}
	
	public void setSSN(String ssn)	{
		this.ssn = ssn;		
	}
	
	public String getSSN()	{
		return ssn;
	}
	
	//Interface Methods
	
	public void setRate()	{
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate()	{
		System.out.println("INCREASE RATE");
	}
	
	//Define Methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount)	{
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity)	{
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	
	void checkBalance()	{
		System.out.println("Your balance is $" + balance);
	}
	
	void getStatus()	{
		
	}
	
	@Override
	public String toString()	{
		return "[NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + ". BALANCE: $" + balance + " ]";
	}

}
