package arraysExcercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentRefactor {
	private String name;
	private ArrayList<Integer> marks= new ArrayList<Integer>();
	private int sum=0;

	public StudentRefactor(String name, int[] marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
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
	public int getMaximumMark() {
		return Collections.max(marks);
	}
	public int getMinimumMark() {
		return Collections.min(marks);
	}
	
	public BigDecimal getAverageMarks() {
		return new BigDecimal(sum).divide( new BigDecimal(marks.size()));
	}
	public String toString() {
		return name +marks;
	}

	public void addMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
		
	}

	public void removeIndex(int index) {
		// TODO Auto-generated method stub
		marks.remove(index);
	}
}
