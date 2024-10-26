package superKeyword;

public class Vehicle {
	private String color;
	protected int maxSpeed;
	
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
			System.out.println("Vehicle "+" Color "+color+" maxSpeed "+ maxSpeed);
	}
	
}
