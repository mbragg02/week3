package week_three;

public class DividingIntegers {

	/**
	 * Create a Java class called Calculator. The class should implement the following methods, 
	 * each of them printing the result on the screen.
	 * - add(int, int)
	 * - subtract(int, int)
	 * - multiply(int, int)
	 * - divide(int, int)
	 * - modulus(int, int)
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator myclalc = new Calculator();
		
		myclalc.add(5,4);
		myclalc.subtract(5,4);
		myclalc.multiply(5,4);
		myclalc.divide(10,9);
		myclalc.modulus(6,4);

	}

}
