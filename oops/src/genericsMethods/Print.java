package genericsMethods;

import vehicle.Vehicle;

public class Print {
	
	//public static <T> void printArray(T arr[]) {	//generic Method, T before return type
	//public static <T extends Vehicle> void printArray(T arr[]) {
	public static <T extends printInterface> void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]);
			arr[i].print();
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer a[]= new Integer[10];

		for(int i=0;i<a.length;i++) {
			a[i]=(i+1)*10;;
		}
		
		String s[]= new String[10];

		for(int i=0;i<s.length;i++) {
			s[i]="abc"+i;
		}
		//printArray(a);
		//printArray(s);
		
		Vehicle v[]=new Vehicle[10];
		for(int i=0;i<10;i++)
			v[i]=new Vehicle(10);
		
		printArray(v);
		
		Student students[]=new Student[10];
		for(int i=0;i<10;i++)
			students[i]=new Student();

		printArray(students);
				
	}

}
