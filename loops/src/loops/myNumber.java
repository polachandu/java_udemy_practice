package loops;

public class myNumber {
	private int num;
	private int sum=0;
	private int sumOfTheDivisors=0;
	public myNumber(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	public boolean isPrime() {
		
		if(num<2) {        //guard check
			return false;
		}
		
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true ;
		
	}
	public int sumUptoN() {
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
	public int sumOfDivisors() {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				sumOfTheDivisors+=i;
			}
		}
		return sumOfTheDivisors;
	}
	
	public void printATriangle() {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
