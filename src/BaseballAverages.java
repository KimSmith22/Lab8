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
		int value = 0;
		int[] array = null ;
		int battters = 0;
		String choice = "y";

		// sysout
		System.out.println("Batting Average Calculator");
		System.out.println();
		do {// initIate do while loop for continue statement
			// prompt for user input
			System.out.println("Please pick a player using 1 thru 5");
			Scanner k = new Scanner(System.in);
			int player = k.nextInt();
			k.nextLine();
			
			System.out.println("Enter number of times at bat (1 thru 5):  ");
			int atBat = k.nextInt();

			// array of unknown length
			int[] times = new int[atBat];
			while (atBat < 1 || atBat > 5) {// boolean statement to initiate loop &
								// validation statement
				System.out.println("Please enter a number between 1 and 5");
				/*
				* line 30 requires coding both sides of the spectrum of numbers you want
				* to be out of range for input within the program
				*/
				atBat = k.nextInt();
			} // end loop

			// scoring legend
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			System.out.println();

		
			/*
			 * the following code will be replaced by more array data related to multiple players
			 * a single array was used to test the program
			 */
			 int[] batters = {0, 4, 1, 3, 2}; // code to print array data to console; i need a multi-dimensional array here
		
//			 batters[0] = 3,  2, 1, 0, 0;
//			 batters[1] = 2, 4, 4, 0, 1;
//			 batters[2] = 1, 1, 0, 4, 3;
//			 batters[3] = 1, 1, 2, 2, 4 ;
//			 batters[4] = 0, 4, 1, 1, 2 ;
			 
			double sum = 0.000; // sets sum to double showing three places past
								// decimal
			for (int i = 0; i < times.length; i++) {// initiate for loop
				sum += batters[i];
				/*
				 * tried a bunch of different variables in the following line in
				 * an attempt to see which variable would get the output to
				 * increment;
				 */
				//System.out.println("For player:  " + num);
				System.out.println("Result for at-bat " + (i + 1) + ":  " + batters[i]);
			} // end for loop
			System.out.println();
			/*
			 * batting average not computing correctly; need to divide by number
			 * of instances where batter makes a base, currently dividing by
			 * total number of times at bat.
			 */
			System.out.println("Batting average is:  " + (times.length / sum));//need to divide hits, by sum
			System.out.println("Slugging Percent:  " + (sum / times.length));
			System.out.println();

			System.out.println("Another batter?  y/n");
			choice = k.nextLine();
		} while (choice.equals("y"));

	}// psvm

}// end class