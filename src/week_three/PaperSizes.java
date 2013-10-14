package week_three;

public class PaperSizes {

	/**
	 * A Din-A0 sheet of paper is 841mm x 1189mm (its surface is one square meter). 
	 * Successive measurements of paper are defined recursively as ÒhalfÓ or ÒdoubleÓ the preceding size. 
	 * Therefore, a Din-A1 sheet of paper is half of Din-A0, or 594mm x 841mm; while a Din-A00 is double of Din-A0, 
	 * or 1189mm x 1682mm
	 * Create a method that takes a String parameter representing a size (e.g. ÓA4Ó, ÒA00000Ó) and prints on 
	 * screen the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors 
	 * when calculating smaller sizes.
	 */
	public static void main(String[] args) {
		Paper_size a0 = new Paper_size();
		a0.longside = 1189;
		a0.shortside = 841;
		a0.paperNumber = 0;
		Paper_size a1 = getMeSmallerSize(a0);
		
		String paperSize = "a4";
		int size = 0;
		paperSize = paperSize.substring(1);

		if (paperSize.equals("00")) {
			size = -1;
		} else if (paperSize.equals("0000")) {
			size = -2;
		} else {
			size = Integer.parseInt(paperSize);
		}
		
		Paper_size an = getRightSize(a0, size); 
		System.out.println("A1 is " + a1.longside + "x" + a1.shortside);
		System.out.println("A" + paperSize + " is " + an.longside + "x" + an.shortside);

	}
	
	
	public static Paper_size getRightSize(Paper_size biggerSize, int target) {
		
		if (biggerSize.paperNumber == target) {
			return biggerSize;
		} else {
			Paper_size result = new Paper_size();
			if (target > biggerSize.paperNumber) {
				result.shortside = biggerSize.longside / 2;
				result.longside = biggerSize.shortside;
				result.paperNumber = biggerSize.paperNumber + 1;
				result = getRightSize(result, target);
				return result;
			} else {
				result.shortside = biggerSize.longside;
				result.longside = biggerSize.shortside * 2;
				result.paperNumber = biggerSize.paperNumber - 1;
				result = getRightSize(result, target);
				return result;
				
			}
			
		}

		
	}
	
	public static Paper_size getMeSmallerSize(Paper_size bigSize) {
		Paper_size result = new Paper_size();
		result.shortside = bigSize.longside / 2;
		result.longside = bigSize.shortside;
		result.paperNumber = bigSize.paperNumber + 1;
		
		return result;
	}
	
	
	

}

class Paper_size {
	int longside;
	int shortside;
	int paperNumber;
}
