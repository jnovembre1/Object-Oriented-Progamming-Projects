//Graduate class
public class Graduate extends Student
{
	private int level = 0;
	
	public Graduate(String name, int studentNumber)
	{
		super(name, studentNumber);
		
	}
	
	public void reset(String newName, int newStudentNumber, int newLevel) //method that resets the name, level, and student number of undergraduate object
	  {
		  newName = getName();
		  newStudentNumber = getStudentNumber();
		  newLevel = level;
	  }
	  
	  public int getLevel() //method that retrieves value of a students level
	  {
		 
		  return level;
	  }
	  
	  public void setLevel(int newLevel) //method that sets the level of a student
	  {
		  newLevel = level;
	  }
	  
	  public void writeOutput() //method that posts output of undergraduate student
	  {
		  super.writeOutput();
		  System.out.println("Student Level: " + level);
	  }
	  
	  public boolean equals(Graduate otherGraduate)	
	  {
		  return true;
	  }
	
}
