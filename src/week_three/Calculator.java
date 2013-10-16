package week_three;

public class Calculator {
	
	public void add(int x, int y) {
		System.out.println(x + y);
	}
	
	public void subtract(int x, int y) {
		System.out.println(x - y);
	}
	
	public void multiply(int x, int y) {
		System.out.println(x * y);
	}
	
	public void divide(int x, int y) {
		double result = ((double) x) / y;
		System.out.printf("%.2f\n", result);
		
	}
	
	public void modulus(int x, int y) {
		System.out.println(x % y);
	}

}
