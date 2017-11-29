
public class Student extends Person 
{
	//fields
	private double GPA; 
	private int Grade; //what grade level student is in
	private int Tardies; //how many student has been late to school
							//starts at 0, plus one every time they are late
	
		public double getGPA() 
		{
			return GPA;
		}

		public void setGPA(double gPA) 
		{
			GPA = gPA;
		}

		public int getGrade() 
		{
			return Grade;
		}

		public void setGrade(int grade) 
		{
			Grade = grade;
		}

		public int getTardies() 
		{
			return Tardies;
		}

		public void setTardies(int tardies) 
		{
			Tardies = tardies;
		}

		
	public Student (int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies)
	{
		super (height, firstName, familyName, weight);
		this.GPA = GPA;
		this.Grade = Grade;
		this.Tardies = Tardies;
	}
	

	@Override
	public String toString() 
	{
		return (getFamilyName() + ", " + getFirstName());
	}
}
