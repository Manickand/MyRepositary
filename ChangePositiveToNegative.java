package week1.day1;

public class ChangePositiveToNegative {
	public static void main(String[] args) {
		
		int numb = -34;
		if(numb<=1) 
		{
			numb = numb*(-1);
			System.out.println("The number is converted to positive Number " +numb);
		}
		else
		{
			System.out.println("The number is already a Positive Number");
		}
	}

}
