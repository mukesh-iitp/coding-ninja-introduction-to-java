package ClassesAndObjects;

public class Student {
	
	public String name;
	//final data members can be initialized as soon as they are declared.
	private final int rollNumber;
	
	private static int numStudents;
	
//	public Student() {
//		rollNumber=100;
//	}
	
	public Student(String name, int rollNumber) {	//custom constructor
		//System.out.println(this);
		this.name=name;
		this.rollNumber=rollNumber;
		numStudents++;
	}
	
//	public void setRollNumber(int rn) {
//		if(rn<0)
//			return;
//		rollNumber=rn;
//	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public void print()
	{
		System.out.println(name+": "+rollNumber);
	}

}
