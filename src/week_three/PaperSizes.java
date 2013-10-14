package week_three;

public class PaperSizes {

	/**
	 * A Din-A0 sheet of paper is 841mm x 1189mm (its surface is one square meter). 
	 * Successive measurements of paper are defined recursively as “half” or “double” the preceding size. 
	 * Therefore, a Din-A1 sheet of paper is half of Din-A0, or 594mm x 841mm; while a Din-A00 is double of Din-A0, 
	 * or 1189mm x 1682mm
	 * Create a method that takes a String parameter representing a size (e.g. ”A4”, “A00000”) and prints on 
	 * screen the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors 
	 * when calculating smaller sizes.
	 */
	public static void main(String[] args) {

	}
	
	public static String paperSize(String input) {
		// Define A0 paper size
		int A0sideA = 841;
		int A0sideB = 1189;
		
		int sideA = 0;
		int sideB = 0;
		
		// Determine required paper size from input
		char size = input.charAt(1);
		
		
		
		return "";
	}

}
