package labs;

public class StudentDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Steven", "Pensyl", "987654321");
		Student student2 = new Student("Joe", "Smith", "876543210");
		
		student1.enroll("Math151");
		student1.enroll("Eng255");
		student1.enroll("His211");
		
		//student1.showCourses();
		//student1.checkBalance();
		student1.payTuition(600);
		System.out.println(student1.toString());
		
	}

}

class Student	{
	private static int id = 0;
	private String studentID;
	private String fname;
	private String lname;
	private String email;	// email based on 1st Letter of FirstName and entire LastName
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourses = 800;
	private int balance = 0;
	
	
	public Student(String fname, String lname, String SSN) {
		id++;
		this.fname = fname;
		this.lname = lname;
		this.SSN = SSN;
		setStudentID();
		setEmail();
		
	}	
	
	public String getPhone()	{
		return phone;
	}
	
	public void setPhone(String phone)	{
		this.phone = phone;
	}
	
	public String getCity()	{
		return city;
	}
	
	public void setCity(String city)	{
		this.city = city;
	}
	
	
	public String getState()	{
		return state;
	}
	
	public void setState(String state)	{
		this.state = state;
	}
	
	private void setEmail()	{
		email = fname.substring(0, 1).toLowerCase() + lname.toLowerCase()  +"@school.com";
		System.out.println("YOUR EMAIL ADDRESS IS: " + email);
	}
	
	
	private void setStudentID()	{
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		studentID = id + "" + randNum + (SSN.substring(5));
		System.out.println("YOUR STUDENT ID IS: " + studentID);
		}

	public void enroll(String course)	{
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourses;
	}
	
	public void payTuition(int amount)	{
		System.out.println("PAYMENT: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance()	{
		System.out.println("BALANCE $" + balance);
	}
	
	public void showCourses()	{
		System.out.println(courses);
	}
	
	public String toString()	{
		return "[NAME: " + fname + " " + lname + " ]\n[COURSES: " + courses + " ]\nBALANCE: $" + balance + "]:";
	}


}