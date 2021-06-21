package loops;

public class myNumberRunner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNumber number = new myNumber(9);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime "+ number.isPrime());
		int sum = number.sumUptoN();
		System.out.println("sum is "+sum);
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sum of divisors is "+sumOfDivisors);
		number.printATriangle();

	}

}
