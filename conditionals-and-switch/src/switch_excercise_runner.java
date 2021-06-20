import java.util.Scanner;

public class switch_excercise_runner {
	
		Scanner scanner = new Scanner(System.in);

	


			public void switch_practice(int number1,int number2) {
				//System.out.println("Enter your number 1: ");
				System.out.println("Entered number is: "+number1);
				//System.out.println("Enter your number 2: ");

				System.out.println("Entered number is: "+number2);
				System.out.println("Enter 1: add \nEnter 2: sub \nEnter 3: mul \nEnter 4:div");
				System.out.println("Enter your choice: ");
				Scanner scanner = new Scanner(System.in);

				int choice = scanner.nextInt();
				switch(choice) {
				case 1: System.out.println("Result is: "+ (number1+number2)); 
						break;
				case 2:System.out.println("Result is: "+ (number1-number2)); 
						break;
				case 3:System.out.println("Result is: "+ (number1*number2)); 
						break;
				case 4:System.out.println("Result is: "+ (number1/number2)); 
						break;
				default :System.out.println("Invalid operation"); 
						break;
			}

}
	}
