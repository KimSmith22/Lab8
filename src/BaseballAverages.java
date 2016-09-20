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
		String choice = "y";

		// sysout
		System.out.println("Batting Average Calculator");
		System.out.println();
		do {// initIate do while loop for continue statement
			// prompt for user input
			System.out.println("Enter number of times at bat:  ");
			Scanner k = new Scanner(System.in);

			// array of unknown length
			int atBat = Integer.parseInt(k.nextLine());
			int[] times = new int[atBat];
			while (atBat < 0 || atBat > 4) {// boolean statement to initiate loop &
								// validation statement
				System.out.println("Please enter a number between 0 and 4")
				;/*if the above line prints and user follows with a number
				* within range an exception displays; not sure why
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
			int[] base = { 0, 4, 0, 1, 3 }; // code to print array data to console
			/*
			 * int[]batters = new int[5];
			 * batters[0] = { };
			 * batters[1] = { };
			 * batters[3] = { };
			 * batters[4] = { };
			 */
			double sum = 0.000; // sets sum to double showing three places past
								// decimal
			for (int i = 0; i < times.length; i++) {// initiate for loop
				sum += base[i];
				/*
				 * tried a bunch of different variables in the following line in
				 * an attempt to see which variable would get the output to
				 * increment;
				 */
				System.out.println("Result for at-bat " + (i + 1) + ":  " + base[i]);
			} // end for loop
			System.out.println();
			/*
			 * batting average not computing correctly; need to divide by number
			 * of instances where batter makes a base, currently dividing by
			 * total number of times at bat.
			 */
			System.out.println("Batting average is:  " + (times.length / sum));//need to create method to calculate hits, not at bats
			System.out.println("Slugging Percent:  " + (sum / times.length));
			System.out.println();

			System.out.println("Another batter?  y/n");
			choice = k.nextLine();
		} while (choice.equals("y"));

	}// psvm

}// end class