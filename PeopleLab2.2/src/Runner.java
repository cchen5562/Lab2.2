
public class Runner 
{
	public static void main(String[] args)
	{
		//fields
		//used a random name generator
		//a pre-made list of first names
		String[] firstNames = {"Jerry", "Gunner", "Adelyn", "Khloe", "Jovani", "Madeleine", "Asa", "Alberto", "Ibrahim", "Ainsley",
				 						"Kyleigh", "Marc", "Angeline", "Corey", "Macy", "Angelo", "Mcintyre", "Alaina", "Yamilet", "Carleigh",
				 						"Jonathan", "Dayami", "Jax", "Yair", "Jamarcus", "Kaylah", "Francis", "Junior", "Angelica", "Jacqueline",
				 						"Shyanne", "Jovanni", "Jayvon", "Nathalia"};
		//a pre-made list of family names
		String[] familyNames = {"Davis", "Mckenzie", "Harding", "Young", "Waller", "Quinn", "Bartlett", "Woodard", "Singleton", "Long",
					"Humphrey", "Heath", "Orozco", "Mcclure", "Cisneros", "Ball", "Bush", "Lynch", "Ortega", "Vasquez",
					"Moore", "Mays", "Mccoy", "White", "Wells", "Fritz", "Rush", "Snow", "Moran", "Stephenson",
					"Mcintyre", "Mora", "Cobb", "Duran"};
		
		Student[] s = new Student[34];
		
		//for(int i = 0; i < s.length; i++) 
		//{
			//int j = 1; //
			//System.out.println(j + "." + s.length);
			//j++;
		//} 
		
		public Runner (Teacher Teacher, Student Student, Classroom Classroom)
		{
			super(Teacher, Student, Classroom); //must call super constructor first
			this.Teacher = Teacher;
			this.Student = Student;
			this.Classroom = Classroom;
		}
	}
}
