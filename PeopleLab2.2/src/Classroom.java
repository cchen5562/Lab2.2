
public class Classroom 
{
	//fields
	private Person[] students;
	private Person teacher;
	
	public Classroom (Person[] Student, Person Teacher) 
	{
		this.students = Student;
		this.teacher = Teacher;
		
	}
	
	public String getSubject (String Subject)
	{
		return (teacher.getSubject(Subject));
	}
	
	public double classAvg ()
	{
		double total = 0.0;
		for(Person p : this.students)
		{
			if (p instanceof Student)
			{
				total = total + (Student)p.getGPA();
			}
		}
		return total/this.students.length();
	}
}
