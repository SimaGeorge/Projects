package CarMaintApp;

public class Owner {

	private String name;
	private int salary;
	private int yearlyCarMaintenanceBudget;
	private double consumption;
	private int otherCosts;
	private int technicalInspectionFee;
	private double fuelTypeCost;
	private int paidRepairs;
	
	

	
	public Owner(String name, int salary, int yearlyCarMaintenanceBudget, double consumption, int otherCosts, int technicalInspectionFee, double fuelTypeCost) {
		
		this.name = name;
		this.salary = salary;
		this.yearlyCarMaintenanceBudget = yearlyCarMaintenanceBudget;
		this.consumption = consumption;
		this.otherCosts = otherCosts;
		this.technicalInspectionFee = technicalInspectionFee;
		this.fuelTypeCost = fuelTypeCost;
		
		this.paidRepairs = 0;
	}
	
	public void getName() {
		
		System.out.println("The owners name is " + this.name );
		
	}
	
	public void getSalary() {
		
		System.out.println("The owner has a monthly salary of " + this.salary + " lei.");
	}
	
	public void getCarBudget() {
		
		System.out.println("The yearly budget for the car maintenance is " + this.yearlyCarMaintenanceBudget + " lei.");
	}
	
	public void getPercentageOfSalarySpentOnFuelPerMonth() {
		
		System.out.println("The owner spends monthly the following percent of salary on fuel " + ((this.consumption * this.fuelTypeCost * 30)/ this.salary * 100) + " %");
		
	}
	
	
	public void getPercentageOfMaintenanceBudget() {
		
		System.out.println("The car maintenance budget represents the following percentage from the monthly salary " + ((double)this.yearlyCarMaintenanceBudget / this.salary) * 100 + " %" );
		
	}
	
	public void getPercentageOfExploitingCosts() {
		
		System.out.println("The total exploiting costs represents the following percentage from the monthly salary " + ((this.yearlyCarMaintenanceBudget + this.technicalInspectionFee+ this.otherCosts +this.consumption * this.fuelTypeCost * 30)  / this.salary * 100 + " %" ));
		
	}
	
	public void getRentability() {
		
		if(((this.yearlyCarMaintenanceBudget + this.technicalInspectionFee+ this.otherCosts +this.consumption * this.fuelTypeCost * 30)  / this.salary * 100) > 50){
			
			
			System.out.println("The car maintenance exceeds 50% of the budget. It is too expensive to maintain for the current budget. ");
			
		}else {
			
			
			System.out.println("The car is affordable for the current budget.");
			
		}
		
	}
	
	public void payRepairs(int repairs) {
		
		paidRepairs += repairs;
		
		Service.updateTotalMoneyEarned(repairs);
		
	}
}
	