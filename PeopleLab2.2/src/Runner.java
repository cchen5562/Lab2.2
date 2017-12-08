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
	
	Person [0] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [1] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [2] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [3] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [4] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [5] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [6] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [7] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [8] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [9] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [10] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [11] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [12] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [13] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [14] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [15] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [16] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [17] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [18] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [19] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [20] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [21] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [22] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [23] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [24] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [25] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [26] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [27] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [28] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [29] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [30] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [31] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [32] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	Person [33] = new Student(int height, String firstName, String familyName, double weight, double GPA, int Grade, int Tardies);
	
	
	//public static Student ranStudent()      //random student generator
	//{
	//	Random r = new Random();
	//	height = r.nextInt(26) + 58;		//58 to 84 inches
	//	String firstNames = r.firstNames[r.nextInt(firstNames.length())];
	//	String familyNames = r.familyNames[r.nextInt(familyNames.length())];
	//	weight = r.nextInt(100) + 90; 		//90 to 190 pounds
		
		
	//}
	
	public static int randGPA (double GPA) 
		{
		GPA [] = {2.5, 2.6, 2.7, 2.8, 2.9, 3.0, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.8, 3.9, 4.0}; //GPA 2.5-4.0
		GPA = r.GPA
	
		}
}
