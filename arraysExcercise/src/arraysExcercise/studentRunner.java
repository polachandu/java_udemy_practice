package arraysExcercise;

import java.math.BigDecimal;

public class studentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {100,99,90,96,92};
		Student student = new Student("chandu", marks);
		student.getNumberOfMarks();
		student.getTotalSumOfMarks();
		student.getMaximumMark();
		student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average is "+ average);
	}

}
