package week3.day1;

public class Students {

	public void getStudentInfo(int id, String name)
	{
		System.out.println("The id number is "+id+ "The Name of the Student is "+name);
	}
	public void getStudentInfo(String str, long ph)
	{
		System.out.println("The email ID is "+str+ " and The Phone Number of the Student is "+ph);
	}
	
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(4002, "Manickandan");
		details.getStudentInfo("manickandanvenkat@gmail.com", 9600420050L);
		
	}
}
