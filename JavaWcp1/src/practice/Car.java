package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int i) {
		System.out.println(i + "km 走ります");
		this.fuelAmount -= (i/fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
