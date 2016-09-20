import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class BaseballAverages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// variables
		int hits = 0;
		String choice = "y";

		// sysout
		System.out.println("Batting Average Calculator");
		System.out.println();
		do {// initIate do while loop for continue statement
			// prompt for user input
			
			System.out.println("Enter number of times at bat (1 thru 5):  ");		
			Scanner k = new Scanner(System.in);
			int atBat = k.nextInt();

			// array of unknown length
			int[] times = new int[atBat];
			while (atBat < 1 || atBat > 5) {// boolean statement to initiate loop &
								// validation statement
				System.out.println("Please enter a number between 1 and 5");
				atBat = k.nextInt();
			} // end loop

			// scoring legend
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			System.out.println();
		 
			double sum = 0.000; // sets sum to double showing three places past
								// decimal
			for (int i = 0; i < times.length; i++) {// initiate for loop
				sum += i;
					if(i > 0){//iterates thru each index of array and add instances where index is greater than 0
					 hits = hits + 1;
					}
				//System.out.println("For player:  " + num);
				System.out.println("Result for at-bat " + (i + 1) + ":  ");
				int value = k.nextInt();
			} // end for loop
			System.out.println();
			
			System.out.println("Batting average is:  " + (hits / sum));//need to divide hits, by sum
			System.out.println("Slugging Percent:  " + (sum / times.length));
			System.out.println();
			
			k.nextLine();
			System.out.println("Another batter?  y/n");
			choice = k.nextLine();
		} while (choice.equals("y"));

	}// psvm

}// end class