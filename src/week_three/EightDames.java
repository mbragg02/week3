package week_three;

public class EightDames {

	/**
	 * Create a method that calculates the solution to the problem of the eight Dames: 
	 * “Given a chess board, and knowing that the Dame can reach any tile horizontally, vertically, or diagonally, 
	 * place 8 Dames on the board so that none of them can reach the others by doing only one move”. 
	 * You can return the solution as an array of 8x8 booleans where eight tiles are true (those with the Dames on them) 
	 * and the others are false.
	 * Thus, a solution requires that no two queens share the same row, column, or diagonal.
	 */
	public static void main(String[] args) {
		
		final int BOARDSIZE = 8;
		final int DAMES = 8;
		
		Point adame = new Point();
		boolean[][] board = new boolean[BOARDSIZE][BOARDSIZE];
		
		 board = addDame(adame, board, DAMES);
		 
		 System.out.println(board.length);
		 
		 for (int i = 0; i < board.length; i ++) {
			 for(int j = 0; j < board[0].length; j ++) {
				 System.out.print(board[j]);
			 }
				 
			 
		 }
	}
	
	
	
	public static boolean[][] addDame(Point aDame, boolean[][] board, int num) {
	aDame.x = 0;
	aDame.y = 0;
	
	board[aDame.x][aDame.y] = true;
	
	
	

		
		
		
		return board;
		
	}

}


class Point {
	int x;
	int y;
}
