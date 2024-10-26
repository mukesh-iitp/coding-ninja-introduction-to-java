package vehicle;

import genericsMethods.printInterface;

public class Vehicle implements printInterface {
	protected String color;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed=maxSpeed;
		//System.out.println("Vehicle Constructor");
	}
	
	public Vehicle() {	
		System.out.println("Vehicle Constructor");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void print() {
		//System.out.println("Vehicle class");
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
	
}
