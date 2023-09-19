//Student Class
public class Student extends Person
{
	//class specific variable for keeping track of the Student classes unique characteristic/value, studentNumber
	private int studentNumber = 0;
    
	
	public Student() //no arg constructor for student class
	{
		
	}
	
	public Student(String name, int studentNumber) //constructor for student class
	{
		super(name);
		setStudentNumber(studentNumber);
		name = getName();
	}
	
	public void reset(String newName, int newStudentNumber) //useless but in an ideal world resets string to blank and int's to zero
	{
		newStudentNumber = 0;
		newName = "";
	}
	
	public int getStudentNumber() //retrieves studentNumber
	{
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber)//sets the studentNumber after being passed during method call
	{
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() //writes output of objects characteristics to console
	{
		super.writeOutput();
		System.out.println("Student Number: " + getStudentNumber());
	}
	
	public boolean equals(Student otherStudent) //useless method
	{
		return true;
	}
}
