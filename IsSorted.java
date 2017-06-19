import java.util.Scanner;

public class IsSorted {
	
	// Name: Samira Mantri
	// Date: 10/6/16
	// Assignment: #3
	// Summary: this program will check to see whether 10 numbers entered into an array are sorted
	
	//creating sorting method
	public static boolean isSorted(int[] enteredArray){
		
		// create a new array that will be the sorted version of the enteredArray
		int[] newEnteredArray= new int[10];
		
		// create the new array by copying the enteredArray
		for (int w=0; w<10; w++){
			// 
			newEnteredArray[w] = enteredArray[w];
		}
		// sort the enteredArray regardless of whether it is sorted already
		for (int x = 0; x < newEnteredArray.length - 1; x++) {
			// set a min value
			int minValueToRight = x;
		
		for (int y = x + 1; y < newEnteredArray.length; y++){
			  if (newEnteredArray[y] < newEnteredArray[minValueToRight]) {
				  // find min value
		          minValueToRight = y;
		        }
		}
		if(minValueToRight != x) { 
				// swap in min value
		       int smallerNumber = newEnteredArray[minValueToRight];
		       newEnteredArray[minValueToRight] = newEnteredArray[x];
		       newEnteredArray[x] = smallerNumber;
		     }
		}
		// use a counter to detect how many times the arrays do not equal each other 
		int counter=0;
		
		// compare the two arrays
		for (int x=0; x<10; x++){
			if (newEnteredArray[x] != enteredArray[x]){
				counter+=1;
			}
		}
		// if counter is greater than zero the arrays do not equal each other
		if (counter>0){
			return false;
		}
		// if counter is still zero arrays do equal each other 
		else{
			return true;
		}
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//create an array with the capacity to hold 10 integers
		int[] NewArray = new int[10];
		
		//tell the user they will need to enter 10 numbers
		System.out.println("Please enter 10 numbers to form your list.");
		System.out.println("Afterwards we will see whether it is sorted!");
		System.out.println("");
		
		// create a loop that obtains the numbers from the user and then adds it to the array
		for (int x=0; x<10; x++){
			System.out.print("Enter a number: ");
			int enteredNum = in.nextInt();
			NewArray[x]= enteredNum;
		}
		// if method returns true the list is sorted, if not, it is not sorted
		// tell the user this
		if (isSorted(NewArray) == true){
			System.out.println("");
			System.out.println("Your list is sorted");
		}
		else{
			System.out.println("");
			System.out.println("Your list is NOT sorted");
		}
		// close scanner
		in.close();
	}

}
