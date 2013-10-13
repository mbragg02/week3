package week_three;

public class Factorial {

	/**
	 * The factorial of a natural number is represented with an exclamation mark (!) 
	 * and defined as: 
	 * n! = n x (n -1) x (n - 2) x . . . 2 x 1
	 */
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial (int n) {
		if (n == 1) {
			return 1;
		} else {
			int result = n * factorial(n - 1);
			return result;
		}
	}

}


