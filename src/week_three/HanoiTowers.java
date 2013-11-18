package week_three;

public class HanoiTowers {

	/**
	 * Create a method that calculates the number of moves necessary to move a set of n Hanoi disks 
	 * from the initial post to the last post.
	 * @param args
	 */
	public static void main(String[] args) {
		int disks = 3;  
	    int StepsToSolution = 0;
	    StepsToSolution = hanoi(disks, 1, 3);
	    System.out.println(StepsToSolution + " moves needed.");
	}
	
	public static int hanoi(int nDisks, int postFrom, int postTo) {
		int middlePost;
		int moves = 0;
		
		if(nDisks == 1) {
			return 1;
		} else {
			middlePost = 6 - postFrom - postTo;

			// Moves n - 1 disks from the initial post to the middle post.
			moves += hanoi(nDisks - 1, postFrom, middlePost);
		    
			// Move the last remaining disk from post 1 to post 3;
			moves += 1; 
			
			// Move the n - 1 disks from the middle post to the last post.
			moves += hanoi(nDisks - 1, middlePost, postTo);

		}
		
		return moves;
	}

}
