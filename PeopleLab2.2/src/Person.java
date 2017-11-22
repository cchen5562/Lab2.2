
public abstract class Person 
{
	//fields
	private int height; //inches
	private String firstName, familyName;
	private double weight; //pound
	
	public Person(int height, String firstName, String familyName, double weight)
	{
		this.height = height;
		this.firstName = firstName;
		this.familyName = familyName;
		this.weight = weight;
	}
	
	public abstract String toString();
}
