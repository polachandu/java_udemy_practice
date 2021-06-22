package arraysExcercise;

import java.math.BigDecimal;

public class studentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {100,99,90,96,92};
		StudentRefactor student = new StudentRefactor("chandu", marks);
		student.getNumberOfMarks();
		student.getTotalSumOfMarks();
		System.out.println("Maximun is: "+student.getMaximumMark());
		System.out.println("Minimum is: "+student.getMinimumMark());
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average is "+ average);
		student.addMark(95);
		System.out.println(student);
		student.removeIndex(1);
		System.out.println(student);
	}

}
