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
		System.out.print(paperSize(userPaper));
	}
	
	public static String paperSize(String input) {	
		
		// Define A0 paper size
		int default_shortSide = 841;
		int default_longSide = 1189;
		
		String paper = "";
		
		// Determine required paper size from input
		int size = Integer.parseInt(input.substring(1));

		paper = paperCalculator(default_shortSide, default_longSide, size);

		return paper;
	
	}
	
	public static String paperCalculator(int shortside, int longside, int n) {
		
		int temp_longside;
		int temp_shortside;
		
		String temp = "";
		
		if (n == 0) {
			return "";
		} else {
			temp_shortside = longside / 2;
			temp_longside = shortside;
			n = n - 1;
			temp = paperCalculator(temp_shortside, temp_longside, n);
			
		}
		
//		return temp_longside + "mm " + temp_shortside + "mm"  ;
		return temp;
	}

}
