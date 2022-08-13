package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int performadd = obj.performadd(3, 2, 1);
		int performsub = obj.performsub(11,5);
		double performmul = obj.performmul(2.4, 3.1);
		float performdiv = obj.performdiv(24.2424224F, 2.24F);
		System.out.println("The addition result is "+performadd);
		System.out.println("The subtraction result is "+performsub);
		System.out.println("The multiplication result is "+performmul);
		System.out.println("The division result is "+performdiv);

	}

}
