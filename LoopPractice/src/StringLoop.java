
public class StringLoop {
	
	//print the numbers 1-100
	public void printHundred() {

		for(int i=1; i<=100; i++) {
			System.out.println("The current number is: " + i);
		}
	}
	//prints the even numbers form 0-100(but only the evens)
//	public void evenNumbers() {
//		for(int i=0; i<=100; i +=2) {
//			System.out.println("Im the even number: " + i);
//		}
	
	}
	// prints the odds from 1-100
	public void oddNumbers() {
		for(int i=1; i<=100; i +=2) {
			System.out.println("Im the odd number: " + i);
		}
	}
	//create a method that takes in a string and print the pattern in this specific format 
	//	H
	//	ee
	//	lll
	//	llll
	//	ooooo
	//	
	//	WWWWWWW
	//	ooooooo
	public void printPattern(String word) {
		
		for(int i=0; i<word.length(); i++) {
		for( int j=0; j< i+1; j++) {
				System.out.print(word.substring(i, i+1));
				
		}
		System.out.println("");
		}
	
	}
		
}
//	//printO method loops through a string and print "Found O!" 
//		public void printOs(String word) {
//			//iterates by the letter
//			for(String letter: word) {
//				//if(letter.equalsIgnoreCase("o"));
//				if(letter.equals("o") || letter.equals("O")) {
//					System.out.println("Found O!");
//				}
//			}
//		}
//}
	
	
	