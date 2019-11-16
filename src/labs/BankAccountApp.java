package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acct1 = new BankAccount("051761118", 1000);
		BankAccount acct2 = new BankAccount("062376118", 2000);
		BankAccount acct3 = new BankAccount("041993228", 500);
		
		acct1.setName("Jim");
		System.out.println(acct1.getName());
		acct1.makeDeposit(500);
		acct1.makeDeposit(600);
		acct1.payBill(1000);
		acct1.accrue();
		acct1.toString();
		System.out.println(acct1.toString());
		}
}
	
class BankAccount implements IInterest	{
	
	private static int id = 1000;
	private String accountNumber;	//id + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "210573697";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("NEW ACCOUNT CREATED");
		this.SSN = SSN;
		id++;
		setAccountNumber();
		balance = initDeposit;
		}
	
	private void setAccountNumber()	{
		int random = (int) (Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0, 2);
		System.out.println("YOUR ACCOUNT NUMBER IS: " + accountNumber);
		
		}
	
	public void setName(String name)	{
		this.name = name;
	}
	
	public String getName()	{
		return name;
	}
	
	public void payBill(double amount)	{
		balance = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount)	{
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}
	
	public void showBalance()	{
		System.out.println("BALANCE: " + balance);
	}
	
	public void accruedInterest()	{
		
	}
	
	@Override
	public void accrue()	{
		balance = balance * (1 + rate/100);
		showBalance();
		
		
	}
	
	@Override
	public String toString()	{
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Rounting Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
		
	}
	
	
}
 


