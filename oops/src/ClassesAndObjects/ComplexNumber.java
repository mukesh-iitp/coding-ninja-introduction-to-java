package ClassesAndObjects;

public class ComplexNumber {

		private int real;
		private int imaginary;
		
		public ComplexNumber(int real, int imaginary)
		{
			this.real=real;
			this.imaginary=imaginary;
		}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public void print() {
		System.out.println("ComplexNumber is =" + real + " + " + imaginary + "i");
	}
	
	public void add(ComplexNumber c2) {
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
		//print();
	}
	
	public void multiply(ComplexNumber c1) {
		int tempReal=this.real;
		this.real=(this.real*c1.real)-(this.imaginary*c1.imaginary);
		this.imaginary=(tempReal*c1.imaginary)+(this.imaginary*c1.real);
		//print();
	}
	
	public ComplexNumber conjugate() {
		this.imaginary=-this.imaginary;
		return this;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newReal=c1.real+c2.real;
		int newImaginary=c1.imaginary+c2.imaginary;
		
		ComplexNumber c3= new ComplexNumber(newReal, newImaginary);

		return c3;
		
	}
	
}
