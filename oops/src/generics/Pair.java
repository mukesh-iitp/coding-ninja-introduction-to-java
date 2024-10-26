package generics;

public class Pair<T,V> {	//Pair is Generic class

	private T first;
	private V second;
	

	public Pair(T first, V second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
	public T getFirst() {
		return first;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public void setSecond(V second) {
		this.second = second;
	}
	
	
}
