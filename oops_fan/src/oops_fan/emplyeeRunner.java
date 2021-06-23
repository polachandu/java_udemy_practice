package oops_fan;

public class emplyeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("chandu","programmer");
		//employee.setName("chandu");
		employee.setEmail("chandrahas@gmail.com");
		employee.setPhoneNumber("123456789");
		employee.setEmployeeGrade('A');
		employee.setTitle("programmer");
		System.out.println(employee);
		
	}

}
