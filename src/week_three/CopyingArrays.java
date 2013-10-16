package week_three;

public class CopyingArrays {

	/**
	 * Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers as parameters. 
	 * The method should copy the elements of the first array (you can call it src, from “source”) to the second one 
	 * (dst, from “destination”) as much as possible. 
	 * If the second array is smaller, then only those elements that fit will be copied. 
	 * If the second array is larger, it will be filled with zeroes.
	 * Write a program that creates an object of this class and uses this method to copy some arrays in all three cases: 
	 * • Both arrays are of the same size.
	 * • The source array is longer.
	 * • The source array is shorter.
	 */
	
	public static void main(String[] args) {
		
		int[] sourceArray = {123, 55, 14, 642, 243};
		int[] destinationArray = new int[10];
		
		ArrayCopier myCopyier = new ArrayCopier();
		
		destinationArray = myCopyier.copy(sourceArray, destinationArray);
		
		for (int i = 0; i < destinationArray.length; i++ ) {
			System.out.println(i + ": " + destinationArray[i]);
		}
		

	}

}

/**
 * Class to copy two Arrays
 *
 */
class ArrayCopier {
	
	/**
	 * Method to copy from a source array to a destination array.
	 * @param src int array. The Array to copy.
	 * @param dst int array. The destination array.
	 * @return int array. The copied array
	 */
	public int[] copy(int[] src, int[] dst) {
		
		int[] resultArray;
	
		resultArray = new int[dst.length];
	
	
		for (int i = 0; i < resultArray.length; i++ ) {
			
			if ( i < src.length ) {
				resultArray[i] = src[i];
			} else {
				resultArray[i] = 0;
			}
		}	
		
		return resultArray;	
	}
	
}
