package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
//			
//		Vehicle v = new Vehicle();
//		v.color="Black";
//		v.setMaxSpeed(10);
//		v.print();
		
		Vehicle v=new Car(10, 20);
		//boolean ans=v.isConvertible();	//error vehicle don't have isConvertible() function;
		v.print();	//print func will be called from car obj
		
		Car c = new Car(10,30);
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
		//c.print();
		
		
	}
}
