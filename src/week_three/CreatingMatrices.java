package week_three;

public class CreatingMatrices {

	/**
	 * Creating and modifying two-dimensional arrays in a class.
	 */
	public static void main(String[] args) {
		
		Matrix myMatrix = new Matrix(3,3);
		
		myMatrix.prettyPrint();

		
		System.out.println(myMatrix.toString());
		
		System.out.println(myMatrix.isSymmetrical());

		
		
//		myMatrix.setElement(2,0,20);
		
		myMatrix.setRow(0, "1,2,3");
		
//		myMatrix.setColumn(1, "4,5,6");
		
//		myMatrix.prettyPrint();
		
		
		myMatrix.setMatrix("1,4,2;0,3,4;0,0,1");
		myMatrix.prettyPrint();
		System.out.println(myMatrix.isTriangular());




	}

}

class Matrix {
	
	private int[][] twoDArray;
	private int rows;
	private int colums;
	
	
	/**
	 * Constructor method
	 * @param x integer. Size of the rows.
	 * @param y integer. Size of the columns.
	 */
	public Matrix(int x, int y) {
		this.rows = x;
		this.colums = y;
		
		this.twoDArray = new int [rows][colums];
		
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < colums; j++) {
				this.twoDArray[i][j] = 1;
				}
		}	
	}
	
	
	
	
	/**
	 * A method to modify one element in the array. If the requested element is outside of the 
	 * arrays boundaries then the request will be ignored.
	 * @param x integer. The row of the element to be modified.
	 * @param y integer. The column of the element to be modified.
	 * @param z integer. The new value to be inserted.
	 */
	public void setElement(int x,int y, int z) {
		
		if (x <= this.rows -1 && y <= this.colums - 1) {
			this.twoDArray[x][y] = z;
		}
	}
	
	
	/**
	 * Method that modifies one whole row of the array, given its position as an integer and the list of numbers as a String.
	 * @param x integer. The row to modify.
	 * @param str String. The string containing the values to input into the row X.
	 */
	public void setRow(int x, String str) {
		// Check that the requested row to modify exists.
		if (x <= this.rows - 1) {
			
			// replace all non-digits with an empty string.
			str = str.replaceAll("\\D+","");
			
			//check that the number of digits in the string match the number of elements in the row.
			if (str.length() == rows) {
			
			for (int i = 0; i < this.rows; i ++) {
				this.twoDArray[x][i] = Character.getNumericValue(str.charAt(i));
			}
			}
		}
		
	}
	
	
	/**
	 * Method that modifies one whole column of the array, given its position as an integer and the list of numbers as a String.
	 * @param x integer. The column to modify.
	 * @param str String. The string containing the values to input into the column X.
	 */
	public void setColumn(int x, String str) {
		// Check that the requested column to modify exists.
		if (x <= this.colums - 1) {
			
			// replace all non-digits with an empty string.
			str = str.replaceAll("\\D+","");
			
			//check that the number of digits in the string match the number of elements in the column.
			if (str.length() == colums) {
			
			for (int i = 0; i < this.colums; i ++) {
				this.twoDArray[i][x] = Character.getNumericValue(str.charAt(i));
			}
			}
		}
		
	}
	
	
	
	/**
	 * Returns the contents of the array as a string, using square brackets, commas and semicolons.
	 * @return result String. The formatted string of the array.
	 */
	public String toString() {
		String result = "";
		result += "[";
		
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < colums; j++) {
				result += this.twoDArray[i][j];
				if (j == colums -1) {
					result += ";";
				} else {
					result += ",";
				}
				
				}
		}
		result = result.substring(0, result.length() -1);
		result += "]";
		return result;
	}
	
	
	
	/**
	 * Prints out a formated matrix of the array.
	 */
	public void prettyPrint() {
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < colums; j++) {
				System.out.print(this.twoDArray[i][j] + "\t");
				}
			System.out.print("\n");
		}
	}
	
	
	/**
	 * 4. One-liners for matrices (*)
	 * Extend your Matrix class with a method setMatrix(String) that takes a String representing the 
	 * numbers to be put in the elements of the array separated by commas, separating rows by semicolons, 
	 * e.g. 1,2,3;4,5,6;7,8,9.
	 * @param str String. The string representing the values to be inserted into the matrix.
	 */
	public void setMatrix(String str) {
		// replace all non-digits with an empty string.
		str = str.replaceAll("\\D+","");
		int counter = 0;

		//check that the number of digits in the string match the number of elements in the column.
		if (str.length() == (this.colums * this.rows)) {
			
			for (int i = 0; i < this.rows; i ++) {
				for (int j = 0; j < this.colums; j++) {
					
					this.twoDArray[i][j] = Character.getNumericValue(str.charAt(counter));;
					counter ++;
					}
			}	
			
			
			
		}		
		
	}
	
	/**
	 * Check if the two-dimensional array is symmetrical. Uses the MatrixChecker class.
	 * @return boolean. Symmetrical or not
	 */
	public boolean isSymmetrical() {
		MatrixChecker newchecker = new MatrixChecker();
		return newchecker.isSymmetrical(this.twoDArray);	
	}
	
	
	/**
	 *  Check if the two-dimensional array is a triangular matrix. Uses the MatrixChecker class.
	 * @return boolean. triangular matrix or not
	 */
	public boolean isTriangular() {
		MatrixChecker newchecker = new MatrixChecker();
		return newchecker.isTriangular(this.twoDArray);	
	}
	
	
}
