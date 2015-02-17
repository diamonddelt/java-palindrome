package palindromepkg;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		// create Scanner object to gather user input
		Scanner input = new Scanner(System.in);
	
		String response = "";
		
		try {
			response = input.nextLine();
			
			assert response != null;
		}
		catch (Exception e){
			
		}
		
		Reverser reverser = new Reverser();
		
		// display Palindrome
		System.out.println(reverser.ReverseString(response));
	}

}
