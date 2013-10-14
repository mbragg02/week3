package week_three;

public class PaperSizes {

	/**
	 * A Din-A0 sheet of paper is 841mm x 1189mm (its surface is one square meter). 
	 * Successive measurements of paper are defined recursively as half or double the preceding size. 
	 * Therefore, a Din-A1 sheet of paper is half of Din-A0, or 594mm x 841mm; while a Din-A00 is double of Din-A0, 
	 * or 1189mm x 1682mm
	 * Create a method that takes a String parameter representing a size (e.g. A4, A00000) and prints on 
	 * screen the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors 
	 * when calculating smaller sizes.
	 * 
	 */
	public static void main(String[] args) {
		
		String userPaper = "A4";
		System.out.print(paperSize(userPaper, 841, 1189));
		

	}
	
	public static String paperSize(String input, int shortside, int longside) {	
		
		// Define A0 paper size
//		int default_shortSide = 841;
//		int default_longSide = 1189;
		
		int defaultSize = 0;
		String paperSize = "";
		
		int temp_longside;
		int temp_shortside;
	
		
		
		// Determine required paper size from input
		int size = Integer.parseInt(input.substring(1));
		
		if(size > defaultSize) {
			
//			temp_longside = default_shortSide;
//			temp_shortside = default_longSide / 2;
			
//			default_shortSide = temp_shortside;
//			default_longSide = temp_longside;
			
			System.out.println("shortside " + shortside);
			System.out.println("longside " + longside);

			paperSize = "A" + (size - 1);
			System.out.println(paperSize);

			paperSize = paperSize(paperSize, (longside / 2), shortside);
			
		} 
		
		return paperSize;

		
		
	}

}
