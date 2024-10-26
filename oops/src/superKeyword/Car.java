package superKeyword;

public class Car extends Vehicle{
	
	int numDoors;
	int maxSpeed;
	
	public void print() {
		
		//System.out.println("Car "+" color "+getColor()+" maxSpeed "+maxSpeed+" numDoors "+numDoors);
		
		super.print();
		System.out.println("Car "+" numDoors "+numDoors);
	
	}
	
	public void printMaxSpeed() {
		super.setMaxSpeed(150);
		System.out.println(maxSpeed+" "+super.maxSpeed);
		
	}
	
}
