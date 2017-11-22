
public class Teacher extends Person
{
	//fields
	private String Subject;
	private String Title; //Mr, Ms, Mrs, Mx
	
	public Teacher (int height, String firstName, String familyName, double weight, String Subject, String Title)
	{
		super (height, firstName, familyName, weight); //must call super constructor first
		this.Subject = Subject;
		this.Title = Title;
	}
	
	
}
