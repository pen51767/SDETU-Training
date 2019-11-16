package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		if (bookTitle.contains(wordChoice))	{
			System.out.println("The book contains the word " + wordChoice);
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome"))	{
			System.out.println("The browser is Chrome");
		}
		String firstName = "Steven";
		String lastName = "Pensyl";
		String SSN = "987654321";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 4));
		System.out.println(SSN.substring(5));
	}

}
