
public class Student extends Person 
{
	//fields
	private double GPA; 
	private int Grade; //what grade level student is in
	private int Tardies; //how many student has been late to school
							//starts at 0, plus one every time they are late
	
	public Student (int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies)
	{
		super (height, firstName, familyName, weight);
		this.GPA = GPA;
		this.Grade = Grade;
		this.Tardies = Tardies;
	}
	
	
}
