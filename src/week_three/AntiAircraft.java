package week_three;

import java.util.Scanner;

public class AntiAircraft {

	public static void main(String[] args) {
		
		boolean gameRun = true;
		
		Target mytarget = new Target(3);
		
		Scanner in = new Scanner(System.in);
		
		while(gameRun) {
			mytarget.init();
//			mytarget.prettyPrint();
			
			System.out.println("Here they come! Try to bring the plane down!");
			
			boolean hit = false;
			while (!hit) {
				System.out.print("Enter a coordinate X: ");
				int x = in.nextInt();
				System.out.print("Enter a coordinate Y: ");
				int y = in.nextInt();
				System.out.print("Enter a coordinate Z: ");
				int z = in.nextInt();
				System.out.println(userMessage(mytarget.fire(x, y, z)));
				
				if (mytarget.fire(x, y, z) == Result.HIT) {
					hit = true;
				}
				
			}
			if (!playAgain(in)) {
				gameRun = false;
			}
			
		} // end game loop
		
		
		in.close();
	}
	
	
	
	private static boolean playAgain(Scanner in) {
		
		in.nextLine();
		boolean playagin = false;
					
		System.out.print("Would you like to play again? y or n: ");
		String input = in.nextLine();
		char choice = input.charAt(0);
					
		if (choice == 'y') {
			playagin =  true;
		} else {
			System.out.println("Goodbye");
			playagin =  false;
		}
		return playagin;
		
	}
	
	private static String userMessage(Result x) {
		// 	HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_HIGH, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE
		String message;
		
		switch (x) {
		case HIT:
			message = "You hit it! Well done!";
			break;
		case FAIL_LEFT:
			message = "You missed! The target is to the right!";
			break;
		case FAIL_RIGHT:
			message = "You missed! The target is to the Left!";
			break;
		case FAIL_HIGH:
			message = "You missed! The target is Lower!";
			break;
		case FAIL_LOW:
			message = "You missed! The target is Higher!";
			break;
		case FAIL_SHORT:
			message = "You missed! The target is futher!";
			break;
		case FAIL_LONG:
			message = "You missed! The target is closer!";
			break;
		case OUT_OF_RANGE:
			message = "That shot is way out of range. Try harder!";
			break;
		default: 
			message = "default";
			break;
		}
		
		return message;
	}
	
	

}
