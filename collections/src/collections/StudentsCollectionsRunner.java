package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student Student1, Student Student2) {
		// TODO Auto-generated method stub
		return Integer.compare(Student1.getId(), Student2.getId());
	}

	}
	


public class StudentsCollectionsRunner {
		public static void main(String[] args) {
			List<Student> Student = List.of(new Student(1,"chandu"),new Student(-1,"adam"),new Student(3,"eve"));
			ArrayList<Student> StudentAl = new ArrayList<>(Student);
			System.out.println(Student);
			Collections.sort(StudentAl);
			System.out.println("Desc "+StudentAl);
			StudentAl.sort(new AscendingStudentComparator());
			System.out.println("Asc"+StudentAl);
			
		}
}
