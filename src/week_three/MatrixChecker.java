package week_three;

public class MatrixChecker {
	
	
	/**
	 * Takes an array of integers and returns true if the array is symmetrical and false otherwise.
	 * An array is symmetrical if the element at [0] is the same as the element at [length-1]
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
	 * An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.
	 * @param arr integers. A two-dimensional array to be tested.
	 * @return boolean. Is the array symmetrical or not.
	 */
	public boolean isSymmetrical(int[][] arr ) {
		boolean Symmetrical = false;
		int rows = arr.length;
		int columns = arr[0].length;
		
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
				} else {
					Symmetrical = true;
				}
			}
		}	
		
		return Symmetrical;
	}
	
	
	/**
	 * Takes an Two-dimensional array of integers and returns true if the matrix is triangular and false otherwise.
	 * An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
	 * @param arr integers. A two-dimensional array to be tested.
	 * @return boolean. Is the array symmetrical or not.
	 */
	public boolean isTriangular(int[][] arr ) {
		boolean Symmetrical = false;
		
		int rows = arr.length;
		int columns = arr[0].length;
		
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < columns; j++) {
				if (i > j) {
					if (arr[i][j] != 0) {
						return false;
					} else {
						Symmetrical = true;
					}
				}
				
			}
		}	
		
		
		
		return Symmetrical;
	}
	
	
}
