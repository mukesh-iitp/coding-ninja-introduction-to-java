package ClassesAndObjects;

class Test {
	/*static int marks;
	void set_marks(int marks) {
		this.marks=marks;
	}*/
	
	static int a=10;
	int b=20;
	
	static void fun1()
	{
		a=20;
		//b=10;	//static function cannot use non-static variables.
		//fun2();	//static function cannot call non-static function.
		//System.out.println(this.b);	//Cannot use this and super keyword in static method
	}
	
	void fun2()
	{
		System.out.println("From m2");
	}
	
}
