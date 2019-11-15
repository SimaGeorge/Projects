package CarMaintApp;

import java.util.List;

public class Service {

	private List<Car> cars;
	private List<Owner> owners;
	private static int totalMonthlyBudget;
	private static int totalMoneyEarned;
	
	
	public Service(List<Car> cars, List<Owner> owners) {
		
		this.cars = cars;
		this.owners = owners;
		totalMonthlyBudget = 8000;
		totalMoneyEarned = 0;
		
	}
	
	public List<Car> getCars(){
		
		return cars;
		
	}
	
	public void addCars(Car car) {
		
		cars.add(car);
	}
	
	public List<Owner> getOwners(){
		
		return owners;
	}
	
	public void addOwners(Owner owner) {
		
		owners.add(owner);
		
	}
	
	public int getTotalMonthlyBudget() {
		
		
		return totalMonthlyBudget;
		
	}
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		
		
		totalMoneyEarned += moneyEarned;
		
	}
	
	public int getTotalMoneyEarned() {
		
		
		return totalMoneyEarned;
		
	}
	
	public int updateMonthlyBudget() {
		
		
		return totalMonthlyBudget += totalMoneyEarned;
		
	}
	
}
