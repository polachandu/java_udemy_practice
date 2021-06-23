package oops_fan;

import java.math.BigDecimal;

public class Employee extends Person{


	private String title;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal Salary;
	
	public Employee(String name,String title ) {
		super(name);
		this.title = title;
		
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	
	public BigDecimal getSalary() {
		return Salary;
	}
	
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	
	public String toString() {
		return title+" "+super.getName()+" "+super.getPhoneNumber()+" "+employeeGrade;
	}
}
