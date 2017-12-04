
public class Classroom 
{
	//fields
	private Person[] student;
	private Person teacher;
	
	public Classroom(Person[] student, Person teacher) 
	{
		this.student = student;
		this.teacher = teacher;
		
	}
	
	public String getSubject ()
	{
		return (((Teacher)teacher).getSubject());
	}
	
	public double classAvg ()
	{
		double total = 0.0;
		for(Person p : this.student)
		{
			if (p instanceof Student)
			{
				total = total + ((Student)p).getGPA();
			}
		}
		return total/this.student.length;
	}
	
	public String printClass()
	{
		String totalClassstud = ((Teacher)this.teacher).getTitle() + ((Teacher)this.teacher).toString() + " \nSubject: " + ((Teacher)this.teacher).getSubject() + " \nStudents in class: ";
		
		for(int i = 0; i < this.student.length; i++)
		{
			totalClassstud += ((Student)this.student[i]).toString();  
		}
		return totalClassstud;
	}
}
