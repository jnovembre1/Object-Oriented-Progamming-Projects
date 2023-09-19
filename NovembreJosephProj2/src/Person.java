//Person Class
public class Person
{
	//class specific variable for keeping track of the Person classes unique characteristic/value, name
	private String name ="";
   
  
   public Person()// no arg constructor
   {
	   
   }
   
   public Person(String name) //constructor that creates a named Person object after name is passed during call
   {
	   setName(name);
   }
   
   public void setName(String newName) //sets the name of Person
   {
	   name = newName;
   }
   
   public String getName() //retrieves name
   {
	   return name;
   }
   
   public void writeOutput() //writes output of objects characteristics to console
   {
	   System.out.println("Name: " + getName());
   }
   
   public boolean hasSameName(Person otherPerson) //useless method
   {
	   return true;
   }
}
