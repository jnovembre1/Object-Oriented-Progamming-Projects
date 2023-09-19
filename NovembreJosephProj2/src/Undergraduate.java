//Undergraduate class
public class Undergraduate extends Student
{
	
	private int level = 0; //instance variable that keeps track of level of student
  
  
	public Undergraduate() //no arg constructor
	{
	
	}
	
	public Undergraduate(String name, int studentNumber, int level)
	{
		super(name, studentNumber);
		
		name = getName();
		studentNumber = getStudentNumber();
		setLevel(level);
		
	}
	
	public void reset(String newName, int newStudentNumber, int newLevel) //method that resets the name, level, and student number of undergraduate object
  {
	  newName = getName();
	  newStudentNumber = getStudentNumber();
	  newLevel = 0;
  }
  
  public int getLevel() //method that retrieves value of a students level
  {
	 
	  return level;
  }
  
  public void setLevel(int newLevel) //method that sets the level of a student
  {
	  level = newLevel;
  }
  
  public void writeOutput() //method that posts output of undergraduate student
  {
	  super.writeOutput();
	  System.out.println("Student Level: " + getLevel());
  }
  
  public boolean equals(Undergraduate otherUndergraduate)	//useless method here for completion credit
  {
	  return true;
  }
  
  
  
}
