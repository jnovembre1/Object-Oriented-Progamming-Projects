// Employee class; 
public class Employee extends Person
{
	//class specific variables for keeping track of the employee classes unique characteristic/value, employeeID and department
	private String department ="";
    private int employeeID = 0;
    
    public Employee()// no arg constructor
    {
    	
    }
    
    public Employee(String name, String department, int employeeID)// more useful constructor
   {
	   super(name);
	   setDepartment(department);
	   setEmployeeID(employeeID);
   }
   
   
    
    public void reset(String newName, String department, int employeeID) //method that doesn't do anything but would reset object to blank values
	{
		newName = "";
    	employeeID = 0;
		department = "";
	}
    
    public int getEmployeeID() //method that retrieves employees ID
    {
    	return employeeID;
    }
    
    public String getDepartment() //method that retrieves employees department name
    {
    	return department;
    }
    
    public void setEmployeeID(int newEmployeeID) //method that sets employeeID
    {
    	employeeID = newEmployeeID;
    }
    
    public void setDepartment(String newDepartment) //method that sets department name
    {
    	department = newDepartment;
    }
    
    public void writeOutput() //writes output of objects characteristics to console
    {
    	super.writeOutput();
    	System.out.println("Dept: " + getDepartment());
    	System.out.println("Employee ID: " + getEmployeeID());
    }
    
    public boolean equals(Employee otherEmployee) //useless method
    {
    	return true;
    }
}
