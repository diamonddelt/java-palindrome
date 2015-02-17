package palindromepkg;

import java.util.*;

public class Reverser {

	// Reverse method will reverse the input string
	public String ReverseString(String response) {
		
		// create a character array based on the string input
		char [] charString = response.toCharArray();
		
		// create a swapping character array the length of the character array
		char [] swapArray = new char[charString.length];
		
		// for each letter in the response string
		for (int i = 0; i < charString.length; i++) {
			
			// add the last letter of the character string to the swapArray
			// subtract one letter for each iteration
			swapArray[i] = charString[(charString.length - 1) - i];
		}
		
		// create a new String of the reversed text
		String reversedResponse = new String(swapArray);
		
		return reversedResponse;
	}
}
