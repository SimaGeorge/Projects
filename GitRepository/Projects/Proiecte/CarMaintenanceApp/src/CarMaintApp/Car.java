package CarMaintApp;

public class Car  {
	
	private String carBrand;
	private String carModel;
	private int year;
	private String color;
	private String carType;
	private double engineCapacity;
	private int horsepower;
	private String fuelType;
	private double consumption;
	private int technicalInspectionFee;
	boolean isFunctional;
	private int otherCosts;
	private double fuelTypeCost;
	
	
	
	
	public Car(String carBrand, String carModel, int year, String color, String carType, double engineCapacity, int horsepower, String fuelType, double consumption, 
				int technicalInspectionFee, boolean isFunctional, int otherCosts, double fuelTypeCost ) {
		
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.year = year;
		this.color = color;
		this.carType = carType;
		this.engineCapacity = engineCapacity;
		this.horsepower = horsepower;
		this.fuelType = fuelType;
		this.consumption = consumption;
		this.technicalInspectionFee = technicalInspectionFee;
		this.isFunctional = isFunctional;
		this.otherCosts = otherCosts;
		this.fuelTypeCost = fuelTypeCost;
		
	}
	
	public void getCarBrand() {
		System.out.println("****************************************");
		System.out.println("The car brand is " + this.carBrand);
		
	}
	
	public void getCarModel() {
		
		System.out.println("The car model is " + this.carModel);
	}
	
	public void getYear() {
		
		System.out.println("The car was produced in the year " + this.year);
	}
	
	public void getColor() {
		
		System.out.println("The car color is " + this.color);
	}
	
	public void getCarType() {
		
		System.out.println("The car body type is " + this.carType);
	}
	
	public void getEngineCapacity() {
		
		System.out.println("The current engine capacity is " + this.engineCapacity + " cmc.");
		
	}
	
	public void getHorsepower() {
		
		System.out.println("The car has " + this.horsepower + " horsepower.");
	}
	
	public void getFuelType() {
		
		System.out.println("The car fuel type is " + this.fuelType);
	}
	
	public void getConsumption() {
		
		System.out.println("The car average consumption is " + this.consumption + " liters/100 km.");
	}
	
	public void getFuelTypeCost() {
		
		System.out.println("The car fuel cost is " + this.fuelTypeCost + " lei.");
		
	}
	
	public void getTechnicalFee() {
		
		System.out.println("The technical inspection fee " + this.technicalInspectionFee + " lei.");
		
	}
	
	public void getOtherCosts() {
		
		System.out.println("Other maintenance car costs are in total " + this.otherCosts + " lei.");
		
	}
	
	
	public void isFunctional() {
		
		if (isFunctional == true) {
			
			System.out.println("The car is functional");
			
		}else {
			
			System.out.println("The car doesn't work");
			
		}
		
	}
	
	public void getAverageMonthlyFuelConsumption() {
		
		System.out.println("The average monthly fuel consumption in liters is " + (this.consumption * 30) +" liters.");
		
	}
	
	public void getAverageYearlyFuelConsumption() {
		
		System.out.println("The yearly fuel consumption in liters is " +(this.consumption * 365) + " liters.");
		
	}
	
	public void getAverageCostPer100KM() {
		
		System.out.println("The average cost per 100 km is " + (this.consumption * this.fuelTypeCost) + " lei");
		
	}
	
	
	public void getAverageMonthlyFuelCost() {
		
		System.out.println("The average monthly fuel cost is " + (this.consumption * this.fuelTypeCost * 30) + " lei.");
	}
	
	public void getYearlyFuelCost() {
		
		System.out.println("The yearly fuel cost is " + (this.consumption * this.fuelTypeCost * 365) + " lei.");
		
	}
	
	public void getYearlyMaintenanceCost() {
		
		System.out.println("The yearly maintenance cost is " + (this.technicalInspectionFee + this.otherCosts +" lei."));
		
	}
	
	public void getYealyExploitingCost() {
		
		System.out.println("The yearly exploiting cost for the car is " + (this.technicalInspectionFee + this.otherCosts + (this.consumption * this.fuelTypeCost * 365) +" lei."));
		System.out.println("****************************************");
	}
	
}
