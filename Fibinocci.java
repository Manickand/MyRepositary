package week1.day2;

public class Fibinocci {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.println(firstNum+"\n"+secondNum);
		
		for (int count =0; count<=11; count++)
		{
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
		}

	}

}
