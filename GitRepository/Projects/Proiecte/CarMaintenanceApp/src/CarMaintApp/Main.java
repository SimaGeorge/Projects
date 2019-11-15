package CarMaintApp;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String [] args) {
		
		Car c1 = new Car("Renault" , "Megane", 2015, "grey", "hatchback", 1.5 , 110, "diesel", 5.5, 400, true, 50 , 4.7);
		Car c2 = new Car("Volkswagen", "Passat", 2012, "black", "sedan", 2.0, 150, "petrol", 6.5, 480, true, 80, 5.2);
		Car c3 = new Car("Renault", "Megane", 2002, "beige", "break", 1.9, 120, "diesel", 5.8, 800, false, 200, 4.7);
		
		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		
		Owner o1 = new Owner("Ionescu George", 4000, 500, 5.5, 50, 400, 4.7);
		Owner o2 = new Owner("Popescu Mihai", 3200, 300, 6.5, 80, 480, 5.2);
		Owner o3 = new Owner("Ion Daniel", 2800, 200, 5.8, 200, 800, 4.7);
		
		List<Owner> ownerList = new ArrayList<>();
		ownerList.add(o1);
		ownerList.add(o2);
		ownerList.add(o3);
		
		Service s1 = new Service(carList, ownerList);
		
		
		c1.getCarBrand();
		c1.getCarModel();
		c1.getYear();
		c1.getColor();
		c1.getCarType();
		c1.getEngineCapacity();
		c1.getHorsepower();
		c1.getFuelType();
		c1.getConsumption();
		c1.getFuelTypeCost();
		c1.isFunctional();
		c1.getTechnicalFee();
		c1.getOtherCosts();
		c1.getAverageMonthlyFuelConsumption();
		c1.getAverageYearlyFuelConsumption();
		c1.getAverageCostPer100KM();
		c1.getAverageMonthlyFuelCost();
		c1.getYearlyFuelCost();
		c1.getYearlyMaintenanceCost();
		c1.getYealyExploitingCost();
		
		o1.getName();
		o1.getSalary();
		o1.getCarBudget();
		o1.getPercentageOfSalarySpentOnFuelPerMonth();
		o1.getPercentageOfMaintenanceBudget();
		o1.getPercentageOfExploitingCosts();
		o1.getRentability();
		
		c2.getCarBrand();
		c2.getCarModel();
		c2.getYear();
		c2.getColor();
		c2.getCarType();
		c2.getEngineCapacity();
		c2.getHorsepower();
		c2.getFuelType();
		c2.getConsumption();
		c2.getFuelTypeCost();
		c2.isFunctional();
		c2.getTechnicalFee();
		c2.getOtherCosts();
		c2.getAverageMonthlyFuelConsumption();
		c2.getAverageYearlyFuelConsumption();
		c2.getAverageCostPer100KM();
		c2.getAverageMonthlyFuelCost();
		c2.getYearlyFuelCost();
		c2.getYearlyMaintenanceCost();
		c2.getYealyExploitingCost();
		
		o2.getName();
		o2.getSalary();
		o2.getCarBudget();
		o2.getPercentageOfSalarySpentOnFuelPerMonth();
		o2.getPercentageOfMaintenanceBudget();
		o2.getPercentageOfExploitingCosts();
		o2.getRentability();
		
		c3.getCarBrand();
		c3.getCarModel();
		c3.getYear();
		c3.getColor();
		c3.getCarType();
		c3.getEngineCapacity();
		c3.getHorsepower();
		c3.getFuelType();
		c3.getConsumption();
		c3.getFuelTypeCost();
		c3.isFunctional();
		c3.getTechnicalFee();
		c3.getOtherCosts();
		c3.getAverageMonthlyFuelConsumption();
		c3.getAverageYearlyFuelConsumption();
		c3.getAverageCostPer100KM();
		c3.getAverageMonthlyFuelCost();
		c3.getYearlyFuelCost();
		c3.getYearlyMaintenanceCost();
		c3.getYealyExploitingCost();
		
		o3.getName();
		o3.getSalary();
		o3.getCarBudget();
		o3.getPercentageOfSalarySpentOnFuelPerMonth();
		o3.getPercentageOfMaintenanceBudget();
		o3.getPercentageOfExploitingCosts();
		o3.getRentability();
		
		o1.payRepairs(450);
		o2.payRepairs(560);
		o3.payRepairs(100);
		
		System.out.println("*************************************************");
		
		System.out.println("The car service has the following monthly budget " + s1.getTotalMonthlyBudget() + " lei") ;
		System.out.println("The car service has earned so far "+ s1.getTotalMoneyEarned() + " lei");
		System.out.println("The car service monthly budget with profits included is "+ s1.updateMonthlyBudget() + " lei");
		
	}
	
	
}
