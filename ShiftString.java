import java.util.Scanner;

public class ShiftString {
	// Name: Samira Mantri
	// Date: 10/6/16
	// Assignment: #3
	// Summary: this program will ask the user to enter a string then shift it by one character
	

	// create a method that shifts the string
	public static String shift(String EnteredString){
		// make the string into an array
		char[] NewArray = new char[EnteredString.length()];
		NewArray = EnteredString.toCharArray();
		
		
		// create a new character array to represent the final shifted string
		char[] FormattedArray = new char[NewArray.length];
				
		// make the last character the first of the final string
		FormattedArray[0] = NewArray[NewArray.length-1];
				
		// shift over every character by one space 
		for (int y=1; y<NewArray.length; y++){
				FormattedArray[y] = NewArray[y-1]; 
		}
		
		String FinalString = new String(FormattedArray);
		return FinalString;
	}
	
	public static void main(String[] args) {
		// open scanner
		Scanner in = new Scanner(System.in);
		
		// introduce the program
		System.out.println("Hello. We are going to shift the characters in a string one space to the right.");
		
		
		// ask the user for a string
		System.out.print("Please enter your desired string: ");
		String EnteredString = in.nextLine();
		
		
		// close scanner
		in.close();
		
		
		// send the entered string to the method to be formed into a character array
		String NewString = shift(EnteredString);
		
		// print out the new string
		System.out.print("The new string is: ");
		System.out.print(NewString);
		
		
		
		
		
	}

}
