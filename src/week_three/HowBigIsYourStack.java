package week_three;

public class HowBigIsYourStack {

	/**
	 * Write a method that calculates the maximum size of the stack (measured in method calls) by forcing a StackOverflowError. 
	 * Use different methods, which different number and types of local variables, and see how the number of 
	 * maximum function calls changes.
	 */
	public static void main(String[] args) {
		overflow(0);

	}
	
	public static void overflow(int x) {
		try {
			int y = x + 1;
			System.out.println(y);
			overflow(y);
		} catch(StackOverflowError e){
            System.err.println("Stack overflow");
        }
		
		
	}

}
