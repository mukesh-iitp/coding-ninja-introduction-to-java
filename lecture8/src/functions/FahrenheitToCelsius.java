package functions;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void printFahrenheitTable(int start, int end, int step) {
	while(start<=end)
	{
		int fahrenheit=(5*(start-32))/9;
		System.out.println(start+" "+fahrenheit);
		start=start+step;
	}
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		s.close();
		FahrenheitToCelsius.printFahrenheitTable(start, end, step);

	}

}
