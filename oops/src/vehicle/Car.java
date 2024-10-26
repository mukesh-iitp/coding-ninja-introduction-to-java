package vehicle;

public class Car extends Vehicle {
	
	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);	//invoking constructor explicitly
		this.numGears=numGears;
		System.out.println("Car Cconstructor");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
//	public void printCar() {
//		System.out.println("Car color : " + color);
//		System.out.println("Car Speed : " + getMaxSpeed());
//		System.out.println("Car numGears : " + numGears);
//		System.out.println("Car isConvertible : " + isConvertible);
//	}
	
	public void print() {
		//System.out.print("Car class");
		//System.out.println("Car color : " + color);
		//System.out.println("Car Speed : " + getMaxSpeed());
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
	
}
