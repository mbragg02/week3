package week_three;

public class Target {
	
	private int[][][] threeDArray;
	private int size;
	private int targetLeftRight;
	private int targetHighLow;
	private int targetShortLong;
	
	
	
	/**
	 * Constructor. Initialize 3d array and set all values to zero.
	 * @param x Integer. The size of the 3d array.
	 */
	public Target(int size) {
		
		this.size = size;
		
		this.threeDArray = new int [size][size][size];
		
		initToZero();
			
	} // end of constructor
	
	
	private void initToZero() {
		for (int i = 0; i < this.size; i ++) {
			for (int j = 0; j < this.size; j ++) {
				for (int k = 0; k < this.size; k ++) {
					this.threeDArray[i][j][k] = 0;
				}
			}
		} // end of nested for loops
	} // end of initToZero
	
	public void init() {
		initToZero();
		this.targetLeftRight = (int) Math.abs(this.size * Math.random());
		this.targetHighLow = (int) Math.abs(this.size * Math.random());
		this.targetShortLong= (int) Math.abs(this.size * Math.random());
		
		this.threeDArray[this.targetLeftRight][this.targetHighLow][this.targetShortLong] = 1;
	} // end of init
	
	
	
	public Result fire(int x, int y, int z) {
		// 	HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_HIGH, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE
		
		if (x >= this.size || y >= this.size || z >= this.size) {
			
			return Result.OUT_OF_RANGE;
			
		} else if (this.threeDArray[x][y][z] == 1) {
			
			return Result.HIT;
			
		} else if (this.targetLeftRight > x) {
			
			return Result.FAIL_LEFT;
			
		} else if (this.targetLeftRight < x) {
			
			return Result.FAIL_RIGHT;
			
		} else if (this.targetHighLow > y) {
			
			return Result.FAIL_LOW;

		} else if (this.targetHighLow < y) {
			
			return Result.FAIL_HIGH;

		} else if (this.targetShortLong > z) {
			
			return Result.FAIL_SHORT;

		} else if (this.targetShortLong < z) {
			
			return Result.FAIL_LONG;
		}
		else {
			
			return Result.OUT_OF_RANGE;
		}
		
	} // end of fire method
	
	
	
	/**
	 * Prints out a formated matrix of the array.
	 */
	public void prettyPrint() {
		for (int i = 0; i < this.size; i ++) {
			for (int j = 0; j < this.size; j ++) {
				for (int k = 0; k < this.size; k ++) {
					System.out.print(this.threeDArray[i][j][k] + "\t");

				}
				System.out.print("\n");
			}
			System.out.print("\n");
		} // end of nested for loops
		
	} // end of prettyPrint

}
