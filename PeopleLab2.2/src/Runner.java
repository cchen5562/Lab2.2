import java.util.Random;
public class Runner 
{
	//fields
	//used a random name generator		
	//a pre-made list of first names
	private static int height;
	private static String[] firstNames = {"Jerry", "Gunner", "Adelyn", "Khloe", "Jovani", "Madeleine", "Asa", "Alberto", "Ibrahim", "Ainsley",				 				
							"Kyleigh", "Marc", "Angeline", "Corey", "Macy", "Angelo", "Mcintyre", "Alaina", "Yamilet", "Carleigh",
			 				"Jonathan", "Dayami", "Jax", "Yair", "Jamarcus", "Kaylah", "Francis", "Junior", "Angelica", "Jacqueline",
			 				"Shyanne", "Jovanni", "Jayvon", "Nathalia"};
	//a pre-made list of family names
	private static String[] familyNames = {"Davis", "Mckenzie", "Harding", "Young", "Waller", "Quinn", "Bartlett", "Woodard", "Singleton", "Long",								
							"Humphrey", "Heath", "Orozco", "Mcclure", "Cisneros", "Ball", "Bush", "Lynch", "Ortega", "Vasquez",
							"Moore", "Mays", "Mccoy", "White", "Wells", "Fritz", "Rush", "Snow", "Moran", "Stephenson",
							"Mcintyre", "Mora", "Cobb", "Duran"};
	private static double weight;
	private static String Subject;
	private static String Title;
	
	
	public static void main(String[] args)
	{
		Person teacher = new Teacher("68", "Joyin", "Wong", "100", "Life", "Mx");	
		Person[] students;
		students = new Person[34];
		
		//for(int i = 0; i < s.length; i++) 
		//{
			//int j = 1; //
			//System.out.println(j + "." + s.length);
			//j++;
		//} 

	}
	
	Person [0] = new Student();
	Person [1] = new Student();
	Person [2] = new Student();
	Person [3] = new Student();
	Person [4] = new Student();
	Person [5] = new Student();
	Person [6] = new Student();
	Person [7] = new Student();
	Person [8] = new Student();
	Person [9] = new Student();
	Person [10] = new Student();
	Person [11] = new Student();
	Person [12] = new Student();
	Person [13] = new Student();
	Person [14] = new Student();
	Person [15] = new Student();
	Person [16] = new Student();
	Person [17] = new Student();
	Person [18] = new Student();
	Person [19] = new Student();
	Person [20] = new Student();
	Person [21] = new Student();
	Person [22] = new Student();
	Person [23] = new Student();
	Person [24] = new Student();
	Person [25] = new Student();
	Person [26] = new Student();
	Person [27] = new Student();
	Person [28] = new Student();
	Person [29] = new Student();
	Person [30] = new Student();
	Person [31] = new Student();
	Person [32] = new Student();
	Person [33] = new Student();
	
	
	public static Student ranStudent()      //random student generator
	{
		Random r = new Random();
		height = r.nextInt(26) + 58;		//58 to 84 inches
		String firstNames = r.firstNames[r.nextInt(firstNames.length())];
		String familyNames = r.familyNames[r.nextInt(familyNames.length())];
		weight = r.nextInt(100) + 90; 		//90 to 190 pounds
		randGPA;
		
	}
	
	public static int randGPA (double GPA) 
		{
		GPA [] = {2.5, 2.6, 2.7, 2.8, 2.9, 3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.8, 3.9, 4.0}; //GPA 2.5-4.0
		GPA = r.GPA
		}
}
