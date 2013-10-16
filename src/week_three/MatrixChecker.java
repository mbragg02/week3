package week_three;

public class MatrixChecker {
	
	
	/**
	 * Takes an array of integers and returns true if the array is symmetrical and false otherwise.
	 * @param arr integer. An array to be tested
	 * @return boolean. Is the array symmetrical or not.
	 */
	public boolean isSymmetrical(int[] arr) {
		boolean Symmetrical = false;
		
		int endPosition = arr.length - 1;
		
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] != arr[endPosition]) {
				return false;
			} else {
				Symmetrical = true;
				endPosition --;
				
			}
			
		}
		
		return Symmetrical;
	}
	
	
	/**
	 * Takes an two-dimensional array of integers and returns true if the matrix is symmetrical and false otherwise.
	 * @param arr integers. A two-dimensional array to be tested.
	 * @return boolean. Is the array symmetrical or not.
	 */
	public boolean isSymmetrical(int[][] arr ) {
		boolean Symmetrical = false;
		
		return Symmetrical;
	}
	
	
	/**
	 * Takes an Two-dimensional array of integers and returns true if the matrix is triangular and false otherwise.
	 * @param arr integers. A two-dimensional array to be tested.
	 * @return boolean. Is the array symmetrical or not.
	 */
	public boolean isTriangular(int[][] arr ) {
		boolean Symmetrical = false;
		
		return Symmetrical;
	}
	
	
}
