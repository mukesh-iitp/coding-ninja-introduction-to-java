package generics;

public class PairUse {
	
	public static void main(String[] args) {
		
		//Pair<String> p=new Pair<String>("ab","cd" );
		Pair<String,String> p=new Pair<String,String>("ab","cd" );
		
		p.setFirst("ef");
		String s=p.getFirst();
		
		
		//Pair<Integer> p1=new Pair<Integer>(1,2);
		Pair<Integer,String> p1=new Pair<Integer,String>(1,"ab");
		
		Pair<Character,Character> p2=new Pair<>('a','c');
		
		int a=10;
		int b=12;
		int c=23;
		
		Pair<Integer,Integer> internalPair=new Pair<>(a,b);
		Pair<Pair<Integer,Integer>,Integer> p3=new Pair<>(internalPair, c);
		
		System.out.println(p3.getSecond());
		System.out.println(p3.getFirst().getFirst());
		System.out.println(p3.getFirst().getSecond());
		
		
	}

}
