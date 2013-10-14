package week_three;

public class Fibonacci {

	/**
	 * Fibonacci numbers
	 */
	public static void main(String[] args) {
		System.out.println(fib(10));
		
		
	}
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
	          return 1;
	        } else {
	        	int result = fib(n-1) + fib(n-2);
	            return result;
	        }
	}

}
