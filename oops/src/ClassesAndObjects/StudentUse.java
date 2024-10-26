package ClassesAndObjects;

//import java.util.Scanner;

public class StudentUse {
	
	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		
		Student s1=new Student("Ankush",001);
		//s1.name="Ankush";
		//s1.rollNumber=001;	//private member
		
		Student s2=new Student("Manisha",002);
		//s2.name="Manisha";
		//s2.rollNumber=002;	//private member
		//s2.setRollNumber(-23);
		
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s2.name);
		//System.out.println(s2.rollNumber);	//private member
		System.out.println(s1.getRollNumber());
		System.out.println(s2.getRollNumber());
		
		//s1.setRollNumber(003);
		System.out.println(s1.getRollNumber());
		
		System.out.println("**************");
		
		s1.print();
		s2.print();
		
		System.out.println();
		//System.out.println(s1.numStudents);
		//System.out.println(s2.numStudents);
		//System.out.println(Student.numStudents); //much better way to access static member.
		System.out.println(Student.getNumStudents());	//Static way of accessing static function.	
		System.out.println(s1.getNumStudents());
		
		
	}

}
