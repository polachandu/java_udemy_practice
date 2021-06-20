package practice;

import java.math.BigDecimal;

public class simpleInterest {
	
	private int principal ;
	private double interest ;
	private int years;
	private double totalSum;
	public simpleInterest(int p,double i) {
		this.principal = p;
		this.interest = i/100;
	}
	public double calculateTotalValue(int y){
		this.years = y;
		totalSum = principal+(principal*interest*y);
		System.out.println(totalSum);
		return 0;
	}

}
