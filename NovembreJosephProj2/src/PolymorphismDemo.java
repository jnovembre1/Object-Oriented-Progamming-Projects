//Made by Joseph Novembre	
//4/19/2023
//EECS1510 Project 2
//Purpose of this application is to demonstrate learned material in course, specifically polymorphism, manipulating and using classes and objects



public class PolymorphismDemo //Principle superclass from which all of the other subclasses extend to
{
	public static void main(String[] args) //main method with a Person array populated by numerous objects from subclasses, achieved by calling constructors
	{
		Person[] people = new Person[21];

		people[0] = new Person("Smith, Ron");
		people[1] = new Undergraduate();
		people[2] = new Undergraduate("Kick, Anita", 9931, 2);
		people[3] = new Employee();
		people[4] = new Staff("Harvey, Patrick", "EECS", 4555, 20);
		people[5] = new Student();
		people[6] = new Staff();
		people[7] = new Person();
		people[8] = new Undergraduate("Bugg, June", 9901, 4);
		people[9] = new Student("DeBanque, Robin", 8812);
		people[10] = new Faculty("Thomas, Lawrence", "EECS", 6221, "Associate Professor");
		people[11] = new Faculty();
		people[12] = new Student("Rumbry, Jon", 9693);
		people[13] = new Employee("Deer, Bob", "CHEM", 4201);
		people[14] = new Faculty("Hobbs, Joe", "EECS", 4531, "Associate Chair");
		people[15] = new Employee("Shmo, Joe", "MAIN", 7824);
		people[16] = new Staff("Yawf, Len", "MECH", 8942, 28);
		people[17] = new Staff("Bruh, John", "ARTE", 2369, -2);
		people[18] = new Employee("Brando, Dio", "JOJO", 8945);
		people[19] = new Faculty("Hennen, Christie", "EECS", 9821, "Advisor");
		people[20] = new Undergraduate("Tired, Iam", 4532, 6);
		
		
		
		for (Person p : people)
		{
			
			p.writeOutput();
			System.out.println();
		}
		
	}
}