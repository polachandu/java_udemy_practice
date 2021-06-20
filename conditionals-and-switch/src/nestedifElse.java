import java.util.Scanner;
public class nestedifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number1 = scanner.nextInt();
		System.out.println("Entered number is: "+number1);
		System.out.println("Enter your number: ");
		int number2 = scanner.nextInt();
		System.out.println("Entered number is: "+number2);
		System.out.println("Enter 1: add \nEnter 2: sub \nEnter 3: mul \nEnter 4:div");
		int choice = scanner.nextInt();
		if(choice==1) {
			System.out.println("Result is: "+ number1+number2); 
		}else if(choice==2) {
			System.out.println("Result is: "+ (number1 - number2)); 
		}else if(choice==3) {
			System.out.println("Result is: "+ number1*number2); 
		}else if(choice==4) {
			System.out.println("Result is: "+ number1/number2);
		}else {
			System.out.println("invalid choise");
		}

	}

}
