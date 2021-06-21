package loops;

import java.util.Scanner;

public class whileNumberPlayer {

	private int limit;
	private int num;

	public whileNumberPlayer(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
		num = 1;
		while (num * num < limit) {
			System.out.println(num * num);
			num++;
		}
		System.out.println();

	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		num = 1;
		while (num * num * num < limit) {
			System.out.println(num * num * num);
			num++;
		}

	}

	public void userInputCube() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number;
		do {
			System.out.println("Enter your input: ");
			number = scanner.nextInt();
			System.out.println("Cube is: " + number * number * number);
		} while (number >= 0);
		System.out.println("Thank you");
	}

}
