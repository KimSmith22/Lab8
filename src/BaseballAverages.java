import java.util.Scanner;

/**
 * 
 */

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
		int times = 0;
		int totTimes = 0;
		int base = 0;
		int slug = 0;
		int batav = 0;

		System.out.println("Batting Average Calculator");
		System.out.println();

		System.out.println("Enter number of times at bat:  ");
		Scanner k = new Scanner(System.in);
		times = k.nextInt();
		System.out.println();
		
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		
		BaseballMethods.getBatAvg(times, totTimes, base, batav);
		BaseballMethods.getSlug(times, base, slug);
		
		

	}// psvm

}// end main
