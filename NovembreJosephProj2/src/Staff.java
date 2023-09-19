//Staff Class
public class Staff extends Employee
{
  
	private int pay = 0; //initializing object & instance specific value to zero.
   
   public Staff() //no arg constructor
   {
	   
   }
   
   public Staff(String name, String department, int employeeID, int pay) //constructor for creating a Staff object with subclasses faculty and employee, all extend to person
   {
	   super(name,department,employeeID);
	  
	   //if statement to check if pay rate is between 1 and 20
	   if (pay >= 1 && pay <= 20)
	   {
		   setPay(pay);
	   }
	   else
	   {
		   pay = 0;
	   }
	   
	   
   }
   
   public void reset(String newName, String departmentName, int employeeID, int pay) //method we're not using that would have reset everything to zero for int, blank for strings
   {
	   pay = 0;
	   newName = "";
	   departmentName = "";
	   employeeID = 0;
	   
   }
   
   public int getPay() //when called retrieves pay
   {
	   return pay;
   }
   
   public void setPay(int newPay) //sets pay, infinitely more useful than getPay method
   {
	   //if statement to check if pay rate is between 1 and 20
	   if (newPay >= 1 && newPay <= 20)
	   {
		   pay = newPay;
	   }
	   else
	   {
		   pay = 0;
	   }
	   
	   return;
	   
   }
   
   public void writeOutput() //writes output of objects characteristics to console
   {
	   super.writeOutput();
	   System.out.println("Pay Grade: " + getPay());
   }
   
   public boolean equals(Staff otherStaff) //useless method
   {
	   return true;
   }
   
}
