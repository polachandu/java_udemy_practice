package practice;

public class numbersrunner {
	
	public int a,b;
	public numbersrunner(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public int add() {
		return a+b;
	}
	public int mul() {
		return a*b;
	}
	public int getNumber1() {
		return a;
	}
	public int getNumber2() {
		return b;
	}
	public void numbersdouble() {
		a = 2*a;
		b=2*b;
		System.out.println(a);
		System.out.println(b);
	}
	
}
