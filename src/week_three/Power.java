package week_three;

public class Power {

	/**
	 * Create a class with a static method pow that takes to integers (base and exponent) and calculates 
	 * the power, e.g. pow(2,3) calculates 2 cubed.
	 */
	public static void main(String[] args) {
		System.out.println(Power_class.pow(2, 4));

	}

}

class Power_class {

	public static int pow (int base, int exponent) {
		
		if (exponent < 0) {
	        System.out.println("Exponent must be greater or equal to 1");
	    }
	    if (exponent == 0) {
	        return 1;
	    } else {
	    	base = base * pow(base, exponent - 1);
	        return base;
	    }
	}
	
}
