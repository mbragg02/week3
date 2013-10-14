package week_three;

public class Palindrome {

	/**
	 * Create a program with a (recursive) method that takes a String paremeter and returns 
	 * true if the String is a palindrome and false otherwise.
	 */
	public static void main(String[] args) {
		String testString = "kayak";
		if(palindrome(testString)) {
			System.out.println("Yes it is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");		
		}

	}
	
	public static boolean palindrome(String input) {
		boolean isAPalindrome;
		int inputLength = input.length();
		if (input.length() == 1) {
			isAPalindrome =  true;
		} else if (input.charAt(0) == input.charAt(inputLength - 1)) {
			isAPalindrome = true;
			if (input.length() == 2) {
				return true;
			}
			String newstring = input.substring(inputLength - (inputLength - 1) , inputLength - 1);
			System.out.println(newstring);
			palindrome(newstring);
			
		} else {
			isAPalindrome = false;
		}

		return isAPalindrome;
	}

}
