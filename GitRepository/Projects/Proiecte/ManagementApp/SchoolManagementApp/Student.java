package SchoolManagementApp;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int paidFees;
	private int totalFees;
	
	public Student(int id, String name, int grade) {
		this.paidFees = 0;
		this.totalFees = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	public void setGrade(int grade) {
		
		this.grade = grade;
		
	}
	
	public void payFees(int fees) {
		
		paidFees+=fees;
		School.updateTotalMoneyEarned(paidFees);
	}
	
		

	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getpaidFees() {
		return paidFees;
		
	}
	
	public int gettotalFees() {
		return totalFees;
		
	}
	
	public int getRemainingFees() {
		return totalFees-paidFees;
		
	}
	
	@Override
	public String toString() { 
		return "Student name:" + this.name + " in " + this.grade + " grade. " + "Paid so far $" + this.paidFees; 
		
	}
}
