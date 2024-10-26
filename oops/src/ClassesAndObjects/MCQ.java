package ClassesAndObjects;

public class MCQ {
	public static void main(String[] args) {
		/*Test t=new Test();
		t.set_marks(78);
		System.out.println(Test.marks);
		*/
		
		Test.fun1();
		
		Book b=new Book();
		
		//b.price=16;	// final price cannot be reassigned. 
		System.out.println(b.price);
	}

}
