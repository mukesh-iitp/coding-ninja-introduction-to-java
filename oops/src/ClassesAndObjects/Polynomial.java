package ClassesAndObjects;

public class Polynomial {
	
	DynamicArray coefficients;
		
	public Polynomial() {
		coefficients= new DynamicArray();
	}
	
	public void setCoefficient(int deg, int coeff) {
		
		coefficients.set(deg, coeff);
	
	}
	
	public int getCoefficient(int deg) {
		
		return coefficients.get(deg);
		

	}

	public void print() {
		
		String result="";
		for(int i=0;i<coefficients.size();i++)
		{
			if(this.coefficients.get(i)==0)
				continue;
			result+=coefficients.get(i)+"x^"+i+" + ";
		}
		System.out.println(result);
	}
	
	public int degree() {
		
		int largestDegree=Integer.MIN_VALUE;
		for(int i=0; i<this.coefficients.size();i++ )
		{
			if(this.coefficients.get(i)!=0)
				largestDegree=i;
		}
		
		return largestDegree;
		
	}
	
	public Polynomial add(Polynomial p) {
		
		for(int i=0;i<this.coefficients.size();i++)
			{
				int coeff1=this.getCoefficient(i);
				int coeff2=p.getCoefficient(i);
				int sumCoeff=coeff1+coeff2;
				this.setCoefficient(i, sumCoeff);
			}
			
		return this;	
	}
	
	public Polynomial subtract(Polynomial p) {
		
		for(int i=0;i<this.coefficients.size();i++)
			{
				int coeff1=this.getCoefficient(i);
				int coeff2=p.getCoefficient(i);
				int subCoeff=coeff1-coeff2;
				this.setCoefficient(i, subCoeff);
			}
			
		return this;	
	}
	
	public Polynomial multiply(Polynomial p) {
		
		Polynomial mul=new Polynomial();
		
		for(int i=0;i<this.coefficients.size();i++) {
			
			for(int j=0;j<p.coefficients.size();j++) {
				
				int tempDeg=i+j;
				int tempCoeff=this.getCoefficient(i)*p.getCoefficient(j);
				//System.out.print("temp coff="+tempCoeff);
				int oldCoeff=mul.getCoefficient(tempDeg);
				mul.setCoefficient(tempDeg, tempCoeff+oldCoeff);	
				/*
				if(i + j <=this.coefficients.size())
					this.setCoefficient( i + j , this.getCoefficient(i+j) + p.getCoefficient(i)*this.getCoefficient(j));
				else 					
					this.setCoefficient(i + j ,p.getCoefficient(i)*this.getCoefficient(j));
				*/
			}
		}
		
		this.coefficients=mul.coefficients;
		
		return this;
	}

	public int evaluate(int x) {
		
		int value=0;
		for(int i=0; i<this.coefficients.size();i++ )
		{
			if(this.coefficients.get(i)==0)
				continue;
			else
				value = (int) (value +	(this.getCoefficient(i)*(Math.pow(x, i))));			
		}
		
		return value;
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2)
	{
		Polynomial p3= new Polynomial();
		
		int polySize=0;
		if(p1.coefficients.size()>p2.coefficients.size())
			polySize=p1.coefficients.size();
		else
			polySize=p2.coefficients.size();
		
		for(int i=0;i<polySize;i++)
		{
			int coeff1=p1.getCoefficient(i);
			int coeff2=p2.getCoefficient(i);
			int sumCoeff=coeff1+coeff2;
			p3.setCoefficient(i, sumCoeff);
		}
		
	return p3;
		
	}
		

}
