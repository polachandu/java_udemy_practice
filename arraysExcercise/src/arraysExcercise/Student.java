package arraysExcercise;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student {
	




	private String name;
	private int[] marks;
	private int sum=0;

	public Student(String string, int[] marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.marks = marks;
	}
	
	public void getNumberOfMarks() {
		System.out.println("Number of marks are ");
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
	public void getTotalSumOfMarks() {
		System.out.println("Total Sum of marks is: ");
		for(int mark: marks) {
			sum+=mark;
		}
		System.out.println(sum);
	}
	public void getMaximumMark() {
		Arrays.sort(marks);
		System.out.println("Maximum mark is: ");
		System.out.println(marks[marks.length-1]);
	}
	public void getMinimumMark() {
		Arrays.sort(marks);
		System.out.println("Minimum mark is: ");
		System.out.println(marks[0]);
	}
	
	public BigDecimal getAverageMarks() {
		return new BigDecimal(sum).divide( new BigDecimal(marks.length));
	}
	

}

