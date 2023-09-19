//Faculty Class
public class Faculty extends Employee
{
	//class specific variable for keeping track of the Faculty classes unique characteristic/value, title
	private String title = "";
    
   public Faculty() //no arg constructor
   {
	   
   }
    
    public Faculty(String name, String department, int employeeID, String title) //more useful constructor
   {
	   super(name, department, employeeID);
	   setTitle(title);
   }
    
    public void reset(String newName, String departmentName, int employeeID, String title) //method that doesn't really do anything but would in theory reset object to blank values
    {
 	   newName = "";
 	   title = "";
 	   departmentName = "";
 	   employeeID = 0;
 	   
    }
    
    public String getTitle() //retrieves title after being called
    {
    	return title;
    }
    
    public void setTitle(String newTitle) //sets title after being called
    {
    	title = newTitle;
    }
    
    public void writeOutput() //writes output of objects characteristics to console
    {
    	super.writeOutput();
    	System.out.println("Title: " + getTitle());
    }
    
    public boolean equals(Faculty otherFaculty) //useless method
    {
    	return true;
    }
}
