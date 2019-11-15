package SchoolManagementApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String [] args) {
		
		Teacher t1 = new Teacher(1, "Popescu Mihaela", 500 );
		Teacher t2 = new Teacher(2, "Popescu Dan", 450);
		Teacher t3 = new Teacher(3, "Ionescu Mihai", 700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		
		Student s1 = new Student(1, "Mihai Daniel", 3);
		Student s2 = new Student(2, "Ionescu Daniela", 6);
		Student s3 = new Student(3, "Popescu Ioana", 8);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		School sch1 = new School(teacherList, studentList);
		
			
		s1.payFees(5000);
		s2.payFees(6000);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("----------------------------");
		
		System.out.println("The General School has earned  " + sch1.getTotalMoneyEarned() + "$");
		
		System.out.println("----------------------------");
		
		Teacher.receiveSalary(t1.getSalary());
		System.out.println("The General School has spent the salary to " + t1.getName()
		+" and now has " + sch1.getTotalMoneyEarned() + "$");
		
		System.out.println("----------------------------");
		
		Teacher.receiveSalary(t2.getSalary());
		System.out.println("The General School has spent the salary to " + t2.getName()
		+" and now has " + sch1.getTotalMoneyEarned() + "$");
		
		System.out.println("----------------------------");
		
		Teacher.receiveSalary(t3.getSalary());
		System.out.println("The General School has spent the salary to " + t3.getName()
		+" and now has " + sch1.getTotalMoneyEarned() + "$");
		
	}

}
